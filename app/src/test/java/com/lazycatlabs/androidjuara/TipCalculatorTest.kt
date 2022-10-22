package com.lazycatlabs.androidjuara

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 **********************************************
 *  AndroidJuara
 * --------------------------------------------
 * Created by Mudassir 🧑🏻‍💻 @ lazycatlabs.com
 * on 📅 22/10/22 🕰 22:42 with ❤️
 * ✉️ : hey.mudassir@gmail.com
 * 🚀 : https://www.github.com/Lzyct
 * 🌐 : https://www.lazycatlabs.com
 **********************************************
 * © 2022 | All Right Reserved
 */
class TipCalculatorTests {


    @Test
    fun calculate20PercentTipNoRoundUp(){
       val amount = 10.00
        val tipPercent = 20.00;
        val expectedTip = "$2.00"
        val actualTip = calculateTip(amount,tipPercent,false)
        assertEquals(expectedTip, actualTip)

    }
}