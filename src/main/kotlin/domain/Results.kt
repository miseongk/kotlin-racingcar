package domain

class Results {

    private val rounds: MutableList<Round> = mutableListOf()

    fun addEachRoundResult(cars: Cars) {
        val carsResult: MutableList<Car> = mutableListOf()
        for (car in cars.values) {
            val result = Car(car.name, car.position)
            carsResult.add(result)
        }
        rounds.add(Round(carsResult.toList()))
    }

    fun findWinners(): List<Car> {
        val finalResult = rounds[rounds.lastIndex]
        return finalResult.findWinners()
    }

    fun getHistory(): List<Round> {
        return rounds.toList()
    }
}
