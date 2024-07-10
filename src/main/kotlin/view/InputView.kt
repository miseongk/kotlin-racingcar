package view

object InputView {

    private const val CAR_NAME_DELIMITER = ","

    fun readCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 ${CAR_NAME_DELIMITER}를 기준으로 구분).")
        val input = readLine()
        return input.split(CAR_NAME_DELIMITER)
    }

    fun readTryCount(): Int {
        println("시도할 횟수는 몇회인가요?")
        val input = readLine()
        validateInt(input)
        return input.toInt()
    }

    private fun readLine() = readlnOrNull() ?: throw IllegalArgumentException("입력값이 없습니다")

    private fun validateInt(input: String): Int {
        try {
            return input.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("숫자가 아닙니다.")
        }
    }
}
