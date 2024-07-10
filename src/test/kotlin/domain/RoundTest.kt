package domain

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RoundTest : StringSpec({

    "우승자를 찾는다" {
        val round = Round(listOf(Car("a", 2), Car("b", 2), Car("c", 1)))
        val winners = round.findWinners()
        assertSoftly {
            winners[0].name.value shouldBe "a"
            winners[1].name.value shouldBe "b"
        }
    }
})
