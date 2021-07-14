package subtask3

import kotlin.time.Duration
import kotlin.time.nanoseconds

class TelephoneFinder {
    fun findAllNumbersFromGivenNumber(number: String): Array<*>? {
        if (number[0] == '-') return null
        val size = number.length
        var result: Array<String?> = arrayOf()
        for (i in 0 until size) {
            val firstPart = number.substring(0 until i)
            val secondPart = number.substring((i + 1) until size)

            when (number[i]) {
                '1' -> {
                    result = result.copyOf(result.size + 2)
                    result[result.size - 2] = firstPart + "2" + secondPart
                    result[result.size - 1] = firstPart + "4" + secondPart
                }
                '2' -> {
                    result = result.copyOf(result.size + 3)
                    result[result.size - 3] = firstPart + "1" + secondPart
                    result[result.size - 2] = firstPart + "3" + secondPart
                    result[result.size - 1] = firstPart + "5" + secondPart
                }
                '3' -> {
                    result = result.copyOf(result.size + 2)
                    result[result.size - 2] = firstPart + "2" + secondPart
                    result[result.size - 1] = firstPart + "6" + secondPart
                }
                '4' -> {
                    result = result.copyOf(result.size + 3)
                    result[result.size - 3] = firstPart + "1" + secondPart
                    result[result.size - 2] = firstPart + "5" + secondPart
                    result[result.size - 1] = firstPart + "7" + secondPart
                }
                '5' -> {
                    result = result.copyOf(result.size + 4)
                    result[result.size - 4] = firstPart + "2" + secondPart
                    result[result.size - 3] = firstPart + "4" + secondPart
                    result[result.size - 2] = firstPart + "6" + secondPart
                    result[result.size - 1] = firstPart + "8" + secondPart
                }
                '6' -> {
                    result = result.copyOf(result.size + 3)
                    result[result.size - 3] = firstPart + "3" + secondPart
                    result[result.size - 2] = firstPart + "5" + secondPart
                    result[result.size - 1] = firstPart + "9" + secondPart
                }
                '7' -> {
                    result = result.copyOf(result.size + 2)
                    result[result.size - 2] = firstPart + "4" + secondPart
                    result[result.size - 1] = firstPart + "8" + secondPart
                }
                '8' -> {
                    result = result.copyOf(result.size + 4)
                    result[result.size - 4] = firstPart + "5" + secondPart
                    result[result.size - 3] = firstPart + "7" + secondPart
                    result[result.size - 2] = firstPart + "9" + secondPart
                    result[result.size - 1] = firstPart + "0" + secondPart
                }
                '9' -> {
                    result = result.copyOf(result.size + 2)
                    result[result.size - 2] = firstPart + "6" + secondPart
                    result[result.size - 1] = firstPart + "8" + secondPart
                }
                else -> {
                    result = result.copyOf(result.size + 1)
                    result[result.size - 1] = firstPart + "8" + secondPart
                }
            }
        }
        return result
    }
}