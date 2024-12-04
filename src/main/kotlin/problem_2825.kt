package edu.nazarov

fun canMakeSubsequence(str1: String, str2: String): Boolean {
    var i = 0
    var j = 0
    while (i < str1.length && j < str2.length) {
        val diff = str1[i] - str2[j]
        println(diff)
        if (diff in -1..0 || diff == 25) {
            j++
        }
        i++
    }
    return j == str2.length
}