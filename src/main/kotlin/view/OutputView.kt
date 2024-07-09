package view

import domain.Car
import domain.Round

object OutputView {

    fun printHistory(gameHistory: List<Round>) {
        println("\n실행 결과")
        for (round in gameHistory) {
            printResultEachRound(round)
        }
    }

    private fun printResultEachRound(round: Round) {
        for (car in round.cars) {
            println("${car.name} : ${"-".repeat(car.position)}")
        }
        println()
    }

    fun printWinnersName(winners: List<Car>) {
        val winnersName = winners.joinToString(", ") { winner -> winner.name }
        println("${winnersName}(이)가 최종 우승했습니다.")
    }
}
