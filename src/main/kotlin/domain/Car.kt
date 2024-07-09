package domain

import domain.strategy.MoveStrategy
import domain.vo.CarName
import kotlin.math.max

private const val INIT_POSITION = 0

class Car(
    name: String,
    var position: Int = INIT_POSITION
) {

    val name: CarName = CarName(name)

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
