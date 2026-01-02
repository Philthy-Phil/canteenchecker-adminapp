package com.example.canteenchecker.adminapp.core

/**
 * Data class representing my own canteen.
 */
data class OwnedCanteenDetails (
    val id: String,
    val name: String,
    val address: String,
    val phoneNumber: String,
    val website: String,
    val dish: String,
    val dishPrice: Double,
    val waitingTime: Int
)

/**
 * Data class representing a review.
 */
data class ReviewData (
    val id: String,
    val creationDate: String,
    val creator: String,
    val rating:	Int,
    val remark:	String
)

/**
 * Data class representing a canteen review statistics.
 */
data class CanteenReviewStatistics(
    val countOneStar: Int,
    val countTwoStars: Int,
    val countThreeStars: Int,
    val countFourStars: Int,
    val countFiveStars: Int,
) {
    val totalRatings: Int = countOneStar + countTwoStars + countThreeStars + countFourStars + countFiveStars
    val averageRating: Double =
        if (totalRatings == 0) 0.0
        else (
            countOneStar * 1 +
            countTwoStars * 2 +
            countThreeStars * 3 +
            countFourStars * 4 +
            countFiveStars * 5
        ) / totalRatings.toDouble()
}

