package com.busra.lenovo.retrofitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.busra.lenovo.retrofitsample.network.RetrofitClient
import com.busra.lenovo.retrofitsample.network.StoriesService
import com.busra.lenovo.retrofitsample.network.response.StoriesByIdResponse
import com.busra.lenovo.retrofitsample.ui.adapter.TagListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager=LinearLayoutManager(this)

        RetrofitClient.getClient()
            .create(StoriesService::class.java)
            .getStoriesById("1").enqueue(object: retrofit2.Callback<StoriesByIdResponse> {
                override fun onFailure(call: Call<StoriesByIdResponse>, t: Throwable) {
                    Toast.makeText(this@MainActivity,"Failure",Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<StoriesByIdResponse>, response: Response<StoriesByIdResponse>) {
                    response.body()?.data
                    Toast.makeText(this@MainActivity,"Succes",Toast.LENGTH_SHORT).show()
                    recyclerView.adapter=TagListAdapter(response.body()?.data?.tags!!)
                }
            })
    }
}
