package com.example.canteenchecker.adminapp.core

/**
 * Interface for the Admin API Calls.
 * * Provides methods for authentication and managing canteen-related data
 * such as dishes, reviews, and general information.
 */
interface AdminApi {

    /**
     * Get an authentication token for the user.
     *
     * @param userName The username of the user.
     * @param password The password of the user.
     * @return The authentication token (JWT) used for subsequent requests.
     */
    suspend fun login(userName: String, password: String): String

    /**
     * Get the canteen data of the user.
     *
     * @param token The token (JWT) of the user.
     * @return [OwnedCanteenDetails] containing name, address and contact info.
     */
    suspend fun getCanteen(token: String): OwnedCanteenDetails

    /**
     * Update the general canteen information.
     *
     * @param token The token (JWT) of the user.
     * @param name The new name of the canteen.
     * @param address The new address of the canteen.
     * @param website The new website of the canteen.
     * @param phoneNumber The new phone number of the canteen.
     */
    suspend fun updateCanteenData(
        token: String,
        name: String,
        address: String,
        website: String,
        phoneNumber: String
    )

    /**
     * Update the current dish and its price for the canteen.
     *
     * @param token The token (JWT) of the user.
     * @param dish The new name or description of the dish.
     * @param price The price of the dish.
     */
    suspend fun updateDish(token: String, dish: String, price: Double)

    /**
     * Update the estimated waiting time at the canteen.
     *
     * @param token The token (JWT) of the user.
     * @param waitingTime The new waiting time in minutes.
     */
    suspend fun updateWaitingTime(token: String, waitingTime: Int)

    /**
     * Retrieve all reviews for the user's canteen.
     *
     * @param token The token (JWT) of the user.
     * @return A list of [ReviewData] objects.
     */
    suspend fun getReviews(token: String): List<ReviewData>

    /**
     * Delete a specific review.
     *
     * @param token The token (JWT) of the user.
     * @param reviewId The unique ID of the review to be removed.
     */
    suspend fun deleteReview(token: String, reviewId: String)

    /**
     * Get the aggregated review statistics of the canteen.
     *
     * @param token The token (JWT) of the user.
     * @return [CanteenReviewStatistics] containing average rating and count.
     */
    suspend fun getReviewStatistics(token: String): CanteenReviewStatistics
}