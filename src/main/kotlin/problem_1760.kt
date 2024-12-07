package edu.nazarov

import kotlin.math.*

fun minimumSize(nums: IntArray, maxOperations: Int): Int {

    fun checkOperations(maxBalls: Int): Boolean {
        var ops = 0
        for (i in nums) {
            ops += ceil(i.toDouble() / maxBalls).toInt() - 1
            if (ops > maxOperations) {
                return false
            }
        }
        return true
    }

    var left = 1
    var right = nums.maxOrNull()!!
    var result = right
    while (left < right) {
        val mid = left + ((right - left) / 2)
        if (checkOperations(mid)) {
            right = mid
            result = mid
        } else {
            left = mid + 1
        }
    }
    return result
}


// 9 / 2
// 4 -> 4 + 2, 4 - 9 % 2 -> 6 / 3 -> 3 / 3 / 3


/*
11 / 2
5 -> 5 + 2, 5 - 11 % 2 -> 7 / 4
7 -> 3 + 2, 3 - 7 % 2 -> 5 / 2 / 4

11
10 / 1
5 / 5 / 1

11
9 / 2
5 / 4 / 2
 */