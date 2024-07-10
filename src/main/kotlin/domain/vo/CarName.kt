package domain.vo

class CarName(val value: String) {

    init {
        require(value.length <= MAX_CAR_NAME_LENGTH) {
            "이름의 길이는 ${MAX_CAR_NAME_LENGTH}자 이하만 가능합니다."
        }
    }

    companion object {
        private const val MAX_CAR_NAME_LENGTH = 5
    }
}
