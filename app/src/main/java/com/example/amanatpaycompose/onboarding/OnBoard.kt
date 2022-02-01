package com.example.amanatpaycompose.onboarding

import com.example.amanatpaycompose.R

data class OnBoard(
    val image: Int,
    val roundedBackground: Int,
    val background: Int,
    val title: Int,
    val description: Int
)

val onBoardItem = listOf<OnBoard>(
    OnBoard(
        image = R.drawable.item1_onboarding,
        roundedBackground = R.drawable.rounded_background_onboarding,
        background = R.drawable.background_onboarding,
        title = R.string.scan_onboarding,
        description = R.string.desc1_onboarding
    ),
    OnBoard(
        image = R.drawable.item2_onboarding,
        roundedBackground = R.drawable.rounded_background_onboarding,
        background = R.drawable.background_onboarding,
        title = R.string.fillout_onboarding,
        description = R.string.desc2_onboarding
    ),
    OnBoard(
        image = R.drawable.item3_onboarding,
        roundedBackground = R.drawable.rounded_background_onboarding,
        background = R.drawable.background_onboarding,
        title = R.string.takeaway_onboarding,
        description = R.string.desc3_onboarding
    )
)