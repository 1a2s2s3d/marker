package com.junga.seoullibrary

import com.junga.seoullibrary.data.Library
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

object SeoulOpenApi {

    val DOMAIN = "http://openapi.seoul.go.kr:8088"
    val API_KEY = "507846626a31613235316e73755641"
}

interface SeoulOpenService{
    @GET("/{key}/json/SeoulPublicLibraryInfo/1/200/")
    fun getLibrary(@Path("key")key:String) : Call<Library>

}