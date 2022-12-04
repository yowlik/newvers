package com.deuscraft.TurboTeami.blocada

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface AdaInistra {
    @GET("json/?key=LvBGVWdHwUSRzGo")
    suspend fun getData(): Response<CountryCodeJS>

    @GET("cafka.json")
    suspend fun getDataDev(): Response<GeoDev>
}



@Keep
data class CountryCodeJS(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("countryCode")
    val countryCode: String,
)

@Keep
data class GeoDev(
    @SerializedName("geo")
    val geo: String,
    @SerializedName("view")
    val view: String,
    @SerializedName("appsChecker")
    val appsChecker: String,
)