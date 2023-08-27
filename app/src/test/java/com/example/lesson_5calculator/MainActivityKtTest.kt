package com.example.lesson_5calculator



import org.junit.jupiter.api.Assertions
import org.junit.Test

class MainActivityKtTest {

    @Test
    fun `return 10`() {
        val actual = calculateSum(5,5)
        val expected = 10

        Assertions.assertEquals(expected, actual)

    }
}