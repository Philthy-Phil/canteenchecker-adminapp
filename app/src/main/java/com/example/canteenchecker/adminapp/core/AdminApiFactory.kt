package com.example.canteenchecker.adminapp.core

import com.example.canteenchecker.adminapp.BuildConfig
import com.example.canteenchecker.adminapp.api.AdminApiImplementation

object AdminApiFactory {
    private const val API_BASE_URL: String = BuildConfig.API_BASE_URL

    fun createAdminApi(): AdminApi {
        return AdminApiImplementation(API_BASE_URL)
    }
}