package domain.vo

private const val MAX_CAR_NAME_LENGTH = 5

class CarName(val value: String) {

    init {
        if (value.length > MAX_CAR_NAME_LENGTH) {
            throw IllegalArgumentException("이름의 길이는 ${MAX_CAR_NAME_LENGTH}자 이하만 가능합니다.")
        }
    }
}
