package domain

import domain.strategy.TestMoveStrategy
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RacingCarGameTest {

    @Test
    fun 게임을_정상적으로_진행하고_우승자를_확인한다() {
        val racingCarGame = RacingCarGame(listOf("a", "b", "c"), 3, TestMoveStrategy())

        racingCarGame.play()

        val winners = racingCarGame.getWinners()
        assertAll(
            { assertEquals("a", winners[0].name) },
            { assertEquals("b", winners[1].name) },
            { assertEquals("c", winners[2].name) }
        )
    }
}
