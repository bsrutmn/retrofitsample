package com.busra.lenovo.retrofitsample.dto

data class DataDTO(
    val weight: Int,
    val sources: SourceDTO,
    val url: String,
    val tags: List<TagDTO>,
    val presentationType: String,
    val primaryTag: TagDTO,
    val publishedDateFormatted: String,
    val status: Int,
    val publishedDate: String,
    val content: String,
    val media: List<MediaDTO>,
    val title:String,
    val seoLink:String,
    val images:List<MediaDTO>,
    val summary:String
) {
}