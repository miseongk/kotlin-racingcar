package domain

import domain.strategy.MoveStrategy

class RacingCarGame(
    cars: List<String>,
    private val tryCount: Int,
    private val moveStrategy: MoveStrategy
) {

    private val cars: Cars = Cars.fromNames(cars)
    private val results: Results = Results()

    fun play() {
        for (round in 0..tryCount) {
            cars.moveAll(moveStrategy)
            results.addEachRoundResult(cars)
        }
    }

    fun getGameHistory(): List<Round> {
        return results.getHistory()
    }

    fun getWinners(): List<Car> {
        return results.findWinners()
    }
}
