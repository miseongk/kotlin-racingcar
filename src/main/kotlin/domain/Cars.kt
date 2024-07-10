package domain

import domain.strategy.MoveStrategy

class Cars private constructor(val values: List<Car>) {

    fun moveAll(moveStrategy: MoveStrategy) {
        for (car in values) {
            car.move(moveStrategy)
        }
    }

    companion object {
        fun fromNames(names: List<String>): Cars {
            return Cars(names.map { name -> Car(name) })
        }

        fun fromCars(cars: List<Car>): Cars {
            return Cars(cars)
        }
    }
}
