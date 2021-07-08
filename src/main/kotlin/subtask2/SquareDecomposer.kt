package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val resultList = decompose2Rec(number.toLong() - 1, number.toLong() * number) ?: return null
        var resultArray: Array<Int> = arrayOf()
        for (i in resultList) {
            resultArray = resultArray.plus(i)
        }
        return resultArray
    }
}

tailrec fun decompose2Rec(i: Long, tot: Long): ArrayList<Int>? {
    if (tot == 0L) {
        return ArrayList()
    }
    if (i <= 0 || tot < 0) {
        return null
    }
    val sublist = decompose2Rec(i - 1, tot - i * i)
    if (sublist != null) {
        sublist.add(i.toInt())
        return sublist
    }
    return decompose2Rec(i - 1, tot)
}