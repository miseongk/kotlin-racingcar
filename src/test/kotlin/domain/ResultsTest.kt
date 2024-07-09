package domain

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ResultsTest {

    @Test
    fun 매_라운드_결과를_추가한다() {
        val results = Results()

        val cars = Cars.fromCars(listOf(Car("a", 2), Car("b", 1), Car("c", 3)))
        results.addEachRoundResult(cars)

        val history = results.getHistory()
        assertAll(
            { assertEquals("a", history[0].cars[0].name) },
            { assertEquals(2, history[0].cars[0].position) },
            { assertEquals("b", history[0].cars[1].name) },
            { assertEquals(1, history[0].cars[1].position) }
        )
    }

    @Test
    fun 마지막_라운드를_통해_우승자를_찾는다() {
        val results = Results()

        val first = Cars.fromCars(listOf(Car("a", 1), Car("b", 1), Car("c", 0)))
        results.addEachRoundResult(first)
        val second = Cars.fromCars(listOf(Car("a", 2), Car("b", 1), Car("c", 1)))
        results.addEachRoundResult(second)

        val winners = results.findWinners()
        assertEquals("a", winners[0].name)
    }
}
