package domain.strategy

class TestMoveStrategy : MoveStrategy {

    override fun move(): Int {
        val number = 4;
        if (number >= 4) {
            return 1;
        }
        return 0;
    }
}
