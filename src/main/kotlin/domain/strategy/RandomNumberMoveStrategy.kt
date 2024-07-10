package domain.strategy

import kotlin.random.Random

class RandomNumberMoveStrategy : MoveStrategy {

    override fun move(): Int {
        val number = Random.nextInt(10)
        if (number >= MOVE_MIN_CONDITION) {
            return MOVE
        }
        return STOP
    }

    companion object {
        private const val MOVE_MIN_CONDITION = 4
        private const val MOVE = 1
        private const val STOP = 0
    }
}
