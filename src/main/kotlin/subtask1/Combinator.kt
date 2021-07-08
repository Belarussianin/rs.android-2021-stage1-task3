package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val result = factorial(array[1]) / array[0]
        var missing = 1
        while (factorial(array[1] - missing) * factorial(missing) != result) {
            missing++
            if (missing > array[1]) {
                return null
            }
        }
        return missing
    }

    private fun factorial(num: Int): Long {
        var result = 1L
        for (i in 2..num) result *= i
        return result
    }
}