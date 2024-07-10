package domain

import domain.strategy.TestMoveStrategy
import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CarsTest : BehaviorSpec({
    
    Given("자동차 3대가 있고") {
        val cars = Cars.fromCars(listOf(Car("a", 2), Car("b", 1), Car("c", 3)))
        When("모두 1씩 움직이면") {
            cars.moveAll(TestMoveStrategy())
            Then("위치가 각각 1씩 증가한다") {
                assertSoftly {
                    cars.values[0].position shouldBe 3
                    cars.values[1].position shouldBe 2
                    cars.values[2].position shouldBe 4
                }
            }
        }
    }
})
