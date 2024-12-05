package edu.nazarov

fun canChange(start: String, target: String): Boolean {
    if (start.length != target.length) return false

    val n = start.length
    var i = 0
    var j = 0

    while (i < n && j < n) {
        if (start[i] == '_') {
            i++
            continue
        }

        if (target[j] == '_') {
            j++
            continue
        }

        if (start[i] != target[j] ||
            start[i] == 'L' && i < j ||
            start[i] == 'R' && i > j) {
            return false
        }
        i++
        j++
    }

    while (i < n && start[i] == '_') {
        i++
    }
    while (j < n && target[j] == '_') {
        j++
    }

    return i == j
}