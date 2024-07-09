package domain

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RoundTest {

    @Test
    fun 우승자를_찾는다() {
        val round = Round(listOf(Car("a", 2), Car("b", 2), Car("c", 1)))

        val winners = round.findWinners()

        assertAll(
            { assertEquals("a", winners[0].name.value) },
            { assertEquals("b", winners[1].name.value) }
        )
    }
}
