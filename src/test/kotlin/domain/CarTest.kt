package domain

import domain.strategy.TestMoveStrategy
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

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

    @ParameterizedTest
    @CsvSource(
        "2, 3",
        "4, 4"
    )
    fun 더_앞에_있는_자동차의_위치를_찾는다(position: Int, expected: Int) {
        val car = Car("name", 3)

        val result = car.findForward(position)

        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @CsvSource(
        "3, true",
        "4, false"
    )
    fun 위치가_같으면_true_다르면_false를_반환한다(position: Int, expected: Boolean) {
        val car = Car("name", 3)

        val result = car.isSamePosition(position)

        assertThat(result).isEqualTo(expected)
    }
}
