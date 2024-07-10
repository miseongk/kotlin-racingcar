import domain.RacingCarGame
import domain.strategy.RandomNumberMoveStrategy
import view.InputView
import view.OutputView

fun main(args: Array<String>) {
    val carNames = InputView.readCarNames()
    val tryCount = InputView.readTryCount()

    val racingCarGame = RacingCarGame(carNames, tryCount, RandomNumberMoveStrategy())
    racingCarGame.play()

    OutputView.printHistory(racingCarGame.getGameHistory())
    OutputView.printWinnersName(racingCarGame.getWinners())
}
