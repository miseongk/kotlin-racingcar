package domain

import domain.strategy.TestMoveStrategy
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class CarTest {

    @Test
    fun 자동차가_정상적으로_움직인다() {
        val car = Car("name")

        car.move(TestMoveStrategy())

        assertThat(car.position).isEqualTo(1)
    }

    @Test
    fun 자동차가_이름이_5자_초과하면_예외가_발생한다() {
        assertThatThrownBy {
            Car("abcdef")
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
