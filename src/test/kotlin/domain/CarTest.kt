package domain

import domain.strategy.TestMoveStrategy
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class CarTest : DescribeSpec({

    describe("move") {
        context("자동차가 앞으로 1만큼 움직이면") {
            it("위치가 1이 된다") {
                val car = Car("name")
                car.move(TestMoveStrategy())
                car.position shouldBe 1
            }
        }
    }

    describe("findForward") {
        listOf(row(2, 3), row(4, 4)).forEach { (position, expected) ->
            context("위치가 ${position}인 자동차와 위치가 3인 자동차가 있다면") {
                it("더 앞의 위치는 ${expected}이다.") {
                    val car = Car("name", 3)
                    val result = car.findForward(position)
                    result shouldBe expected
                }
            }
        }
    }

    describe("isSamePosition") {
        listOf(row(3, true), row(4, false)).forEach { (position, expected) ->
            context("위치가 ${position}라면") {
                it("${expected}이다.") {
                    val car = Car("name", 3)
                    val result = car.isSamePosition(position)
                    result shouldBe expected
                }
            }
        }
    }
})


