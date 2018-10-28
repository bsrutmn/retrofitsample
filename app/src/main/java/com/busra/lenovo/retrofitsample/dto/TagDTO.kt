package com.busra.lenovo.retrofitsample.dto


data class TagDTO(
    val name: String,
    val id: Int,
    val isPrimary: Boolean,
    val followingType: String,
    val position: Int
) {
}