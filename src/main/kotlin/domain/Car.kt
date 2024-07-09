package domain

import domain.strategy.MoveStrategy
import kotlin.math.max

private const val INIT_POSITION = 0
private const val MAX_CAR_NAME_LENGTH = 5

class Car(
    val name: String,
    var position: Int = INIT_POSITION
) {

    init {
        if (name.length > MAX_CAR_NAME_LENGTH) {
            throw IllegalArgumentException("이름의 길이는 ${MAX_CAR_NAME_LENGTH}자 이하만 가능합니다.")
        }
    }

    fun move(moveStrategy: MoveStrategy) {
        position += moveStrategy.move()
    }

    fun findForward(otherPosition: Int): Int {
        return max(this.position, otherPosition)
    }

    fun isSamePosition(otherPosition: Int): Boolean {
        return this.position == otherPosition
    }
}
