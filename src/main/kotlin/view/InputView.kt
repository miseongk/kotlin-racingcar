package view

object InputView {

    private const val CAR_NAME_DELIMITER = ","

    fun readCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 ${CAR_NAME_DELIMITER}를 기준으로 구분).")
        val input = readlnOrNull()
        validateNull(input)
        return input!!.split(CAR_NAME_DELIMITER)
    }

    private fun validateNull(input: String?) {
        if (input == null) {
            throw IllegalArgumentException("입력값이 없습니다.")
        }
    }

    fun readTryCount(): Int {
        println("시도할 횟수는 몇회인가요?")
        val input = readlnOrNull()
        validateNull(input)
        validateInt(input!!)
        return input.toInt()
    }

    private fun validateInt(input: String): Int {
        try {
            return input.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("숫자가 아닙니다.")
        }
    }
}
