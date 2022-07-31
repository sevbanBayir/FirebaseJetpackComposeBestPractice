package com.sevban.firebasewithjetpackcompose.data

data class DataOrException <T , E : Exception?> (
    var data: T? = null,
    var exception: Exception?= null
)
