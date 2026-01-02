package com.example.canteenchecker.adminapp.api

import com.example.canteenchecker.adminapp.core.AdminApi
import com.example.canteenchecker.adminapp.core.CanteenReviewStatistics
import com.example.canteenchecker.adminapp.core.OwnedCanteenDetails
import com.example.canteenchecker.adminapp.core.ReviewData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class AdminApiImplementation(apiBasUrl: String): AdminApi {

    private val retrofit = Retrofit
        .Builder()
        .baseUrl(apiBasUrl)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    override suspend fun login(userName: String, password: String): String {
        TODO("Not yet implemented")
    }

    override suspend fun getCanteen(token: String): OwnedCanteenDetails {
        TODO("Not yet implemented")
    }

    override suspend fun updateCanteenData(
        token: String,
        name: String,
        address: String,
        website: String,
        phoneNumber: String
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun updateDish(
        token: String,
        dish: String,
        price: Double
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun updateWaitingTime(token: String, waitingTime: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun getReviews(token: String): List<ReviewData> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteReview(token: String, reviewId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun getReviewStatistics(token: String): CanteenReviewStatistics {
        TODO("Not yet implemented")
    }
}