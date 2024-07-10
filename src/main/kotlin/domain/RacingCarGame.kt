package domain

import domain.strategy.MoveStrategy
import domain.vo.TryCount

class RacingCarGame(
    cars: List<String>,
    tryCount: Int,
    private val moveStrategy: MoveStrategy
) {

    private val tryCount: TryCount = TryCount(tryCount)
    private val cars: Cars = Cars.fromNames(cars)
    private val results: Results = Results()

    fun play() {
        for (round in 0..tryCount.value) {
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
