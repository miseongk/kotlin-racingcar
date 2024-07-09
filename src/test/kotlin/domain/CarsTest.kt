package domain

import domain.strategy.TestMoveStrategy
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun 모든_자동차를_움직인다() {
        val cars = Cars(listOf("a", "b", "c"))

        cars.moveAll(TestMoveStrategy())

        assertAll(
            { assertEquals(1, cars.values[0].position) },
            { assertEquals(1, cars.values[1].position) },
            { assertEquals(1, cars.values[2].position) },
        )
    }
}
