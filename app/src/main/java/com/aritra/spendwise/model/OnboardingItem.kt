package com.aritra.spendwise.model

import com.aritra.spendwise.R

data class OnboardingItem(
    val title: String,
    val text: String,
    val image: Int
) {
    companion object {
        fun onboardingScreenItems() = listOf(
            OnboardingItem(
                "Keep your information private",
                "Your data is protected",
                R.drawable.ic_launcher_foreground
            ),
            OnboardingItem(
                "Keep your information private",
                "Your data is protected",
                R.drawable.ic_launcher_foreground
            ),
            OnboardingItem(
                "Keep your information private",
                "Your data is protected",
                R.drawable.ic_launcher_foreground
            )
        )
    }
}
