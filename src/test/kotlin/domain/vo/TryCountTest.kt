package domain.vo

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec

class TryCountTest : ShouldSpec({

    should("시도 횟수가 0 미만이면 예외가 발생한다") {
        shouldThrow<IllegalArgumentException> {
            TryCount(-1)
        }
    }
})
