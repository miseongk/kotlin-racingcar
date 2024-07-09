package domain

class Round(val cars: List<Car>) {

    fun findWinners(): List<Car> {
        val winnerPosition = findMaxPosition()
        val winners: MutableList<Car> = mutableListOf()
        for (car in cars) {
            if (car.isSamePosition(winnerPosition)) {
                winners.add(car)
            }
        }
        return winners.toList()
    }

    private fun findMaxPosition(): Int {
        var maxPosition = 0
        for (car in cars) {
            maxPosition = car.findForward(maxPosition)
        }
        return maxPosition
    }
}
