package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_num(){
        val dice=Dice(6)
        val rollRes=dice.roll()
        assertTrue("The value isn't between 1 and 6",rollRes in 1..6)

    }
}