// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    require(data.size > 0) { "not enough data" }
    val sorted = data.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 0) {
        (sorted[mid - 1] + sorted[mid]) / 2
    } else {
        sorted[mid]
    }
}
