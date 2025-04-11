package com.example.gentrier.data.remote

import retrofit2.http.GET

/**
 * Retrofit API service interface.
 * Define all your API endpoints here.
 */
interface ApiService {
    // Example endpoint
    @GET("example")
    suspend fun getExample(): ExampleResponse
}

/**
 * Example response data class.
 * Replace with your actual API response models.
 */
data class ExampleResponse(
    val id: String,
    val name: String,
    val description: String
) 