package domain

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ResultsTest {

    @Test
    fun 매_라운드_결과를_추가한다() {
        val results = Results()

        val cars = Cars(listOf("a", "b", "c"))
        results.addEachRoundResult(cars)

        val history = results.getHistory()
        assertAll(
            { assertEquals("a", history[0].cars[0].name) },
            { assertEquals(0, history[0].cars[0].position) },
            { assertEquals("b", history[0].cars[1].name) },
            { assertEquals(0, history[0].cars[1].position) }
        )
    }
}
