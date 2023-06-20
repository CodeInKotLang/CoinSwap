package com.example.coinswap.data.remote

import com.example.coinswap.data.remote.dto.CurrencyDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("v1/latest")
    suspend fun getLatestRates(
        @Query("apikey") apiKey: String = API_KEY
    ): CurrencyDto

    companion object {
        const val API_KEY = "p72HnN2uDUUHEbh2BEuFgKQRd9pkqutaETfvLoG3"
        const val BASE_URL = "https://api.freecurrencyapi.com/"
    }

}