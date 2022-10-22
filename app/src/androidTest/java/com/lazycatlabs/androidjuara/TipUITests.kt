package com.lazycatlabs.androidjuara

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.lazycatlabs.androidjuara.ui.theme.AndroidJuaraTheme
import org.junit.Rule
import org.junit.Test

/**
 **********************************************
 *  AndroidJuara
 * --------------------------------------------
 * Created by Mudassir 🧑🏻‍💻 @ lazycatlabs.com
 * on 📅 22/10/22 🕰 22:50 with ❤️
 * ✉️ : hey.mudassir@gmail.com
 * 🚀 : https://www.github.com/Lzyct
 * 🌐 : https://www.lazycatlabs.com
 **********************************************
 * © 2022 | All Right Reserved
 */
class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate20PercentTip() {
        composeTestRule.setContent {
            AndroidJuaraTheme {
                CalculatorTip()
            }
        }
        composeTestRule.onNodeWithText("Cost of Service").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip Amount: $2.00").assertExists()
    }
}