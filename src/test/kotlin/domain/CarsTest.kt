package domain

import domain.strategy.TestMoveStrategy
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun 모든_자동차를_움직인다() {
        val cars = Cars.fromCars(listOf(Car("a", 2), Car("b", 1), Car("c", 3)))

        cars.moveAll(TestMoveStrategy())

        assertAll(
            { assertEquals(3, cars.values[0].position) },
            { assertEquals(2, cars.values[1].position) },
            { assertEquals(4, cars.values[2].position) },
        )
    }
}
