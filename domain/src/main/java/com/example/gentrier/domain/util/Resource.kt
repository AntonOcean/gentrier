package com.example.gentrier.domain.util

/**
 * A generic class that holds a value with its loading status
 * Used for handling API responses and other results that can be success, error, or loading
 */
sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    data class Error(val message: String, val exception: Throwable? = null) : Resource<Nothing>()
    data object Loading : Resource<Nothing>()

    companion object {
        fun <T> success(data: T): Resource<T> = Success(data)
        fun error(message: String, exception: Throwable? = null): Resource<Nothing> = Error(message, exception)
        fun loading(): Resource<Nothing> = Loading
    }
}

/**
 * Helper function to convert a try-catch to Resource
 */
inline fun <T> safeCall(block: () -> T): Resource<T> {
    return try {
        Resource.Success(block())
    } catch (e: Exception) {
        Resource.Error(e.message ?: "Unknown error occurred", e)
    }
} 