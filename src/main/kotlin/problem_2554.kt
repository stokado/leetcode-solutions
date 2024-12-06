package edu.nazarov

fun maxCount(banned: IntArray, n: Int, maxSum: Int): Int {
    val banSet = mutableSetOf<Int>()

    for (num in banned) {
        banSet.add(num)
    }

    var maxSumTrack = maxSum
    var result = 0
    for (num in 1..n) {
        if (num in banSet) {
            continue
        }

        if (maxSumTrack - num < 0) {
            return result
        }

        maxSumTrack -= num
        result++
    }

    return result
}