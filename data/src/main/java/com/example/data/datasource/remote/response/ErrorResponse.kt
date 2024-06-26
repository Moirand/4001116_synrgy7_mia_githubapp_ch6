package com.example.data.datasource.remote.response

import com.google.gson.annotations.SerializedName

data class ErrorResponse(

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("documentation_url")
    val documentationUrl: String? = null
)