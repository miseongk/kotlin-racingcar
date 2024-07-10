package domain

import domain.strategy.TestMoveStrategy
import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RacingCarGameTest : StringSpec({

    "게임을 정상적으로 진행하고 우승자를 확인한다" {
        val racingCarGame = RacingCarGame(listOf("a", "b", "c"), 3, TestMoveStrategy())

        racingCarGame.play()

        val winners = racingCarGame.getWinners()
        assertSoftly {
            winners[0].name.value shouldBe "a"
            winners[1].name.value shouldBe "b"
            winners[2].name.value shouldBe "c"
        }
    }
})
