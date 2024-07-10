package domain.vo

import domain.Car
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec

class CarNameTest : ShouldSpec({
    
    should("자동차 이름이 5자를 초과하면 예외가 발생한다") {
        shouldThrow<IllegalArgumentException> {
            Car("abcdef")
        }
    }
})
