package edu.nazarov

fun maxScore(s: String): Int {
    var result = 0

    var ones = s.count { it == '1' }

    var zeroes = 0
    for (i in 0 until s.length - 1) {
        if (s[i] == '0')
            zeroes++
        else
            ones--


        val score = zeroes + ones
        result = maxOf(result, score)
    }

    return result
}