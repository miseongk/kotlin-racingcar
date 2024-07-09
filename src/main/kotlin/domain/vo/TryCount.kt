package domain.vo

private const val MIN_TRY_COUNT = 0

class TryCount(val value: Int) {

    init {
        if (value < MIN_TRY_COUNT) {
            throw IllegalArgumentException("시도 횟수는 최소 ${MIN_TRY_COUNT}이여야 합니다.")
        }
    }
}
