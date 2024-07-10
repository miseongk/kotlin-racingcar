package domain

class Round(val cars: List<Car>) {

    fun findWinners(): List<Car> {
        val winnerPosition = findMaxPosition()
        return cars.filter { it.isSamePosition(winnerPosition) }
    }

    private fun findMaxPosition(): Int {
        var maxPosition = 0
        for (car in cars) {
            maxPosition = car.findForward(maxPosition)
        }
        return maxPosition
    }
}
