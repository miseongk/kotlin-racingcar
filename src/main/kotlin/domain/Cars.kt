package domain

import domain.strategy.MoveStrategy

class Cars(names: List<String>) {

    val values: List<Car>

    init {
        values = names.map { name -> Car(name) }
    }

    fun moveAll(moveStrategy: MoveStrategy) {
        for (car in values) {
            car.move(moveStrategy)
        }
    }
}
