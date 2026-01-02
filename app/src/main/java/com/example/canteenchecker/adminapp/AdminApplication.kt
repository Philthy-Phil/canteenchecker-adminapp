package com.example.canteenchecker.adminapp

import android.app.Application

class AdminApplication: Application() {

    /**
     * Global storage for the authentication token.
     * Synchronized to ensure thread-safety when accessed from different parts of the app
     * (e.g. UI thread and Background Services).
     */
    @get:Synchronized
    @set:Synchronized
    var authenticationToken: String? = null
}