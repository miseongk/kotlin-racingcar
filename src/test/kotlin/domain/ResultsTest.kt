package domain

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ResultsTest : StringSpec({

    "매 라운드 결과를 추가한다" {
        val results = Results()

        val cars = Cars.fromCars(listOf(Car("a", 2), Car("b", 1), Car("c", 3)))
        results.addEachRoundResult(cars)

        val history = results.getHistory()
        assertSoftly {
            history[0].cars[0].name.value shouldBe "a"
            history[0].cars[0].position shouldBe 2
            history[0].cars[1].name.value shouldBe "b"
            history[0].cars[1].position shouldBe 1
        }
    }

    "마지막 라운드를 통해 우승자를 찾는다" {
        val results = Results()

        val first = Cars.fromCars(listOf(Car("a", 1), Car("b", 1), Car("c", 0)))
        results.addEachRoundResult(first)
        val second = Cars.fromCars(listOf(Car("a", 2), Car("b", 1), Car("c", 1)))
        results.addEachRoundResult(second)

        val winners = results.findWinners()
        winners[0].name.value shouldBe "a"
    }
})
