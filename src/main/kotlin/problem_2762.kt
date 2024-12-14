package edu.nazarov

import java.util.TreeMap

fun continuousSubarrays(nums: IntArray): Long {
    val numFreq = TreeMap<Int, Int>()
    var result = 0L
    var left = 0
    val allowedDiff = 2

    for ((right, num) in nums.withIndex()) {
        numFreq[num] = (numFreq[num] ?: 0) + 1

        while (numFreq.lastKey() - numFreq.firstKey() > allowedDiff) {
            numFreq.computeIfPresent(nums[left]) { _, freq -> if (freq == 1) null else freq - 1 }
            left++
        }
        result += right - left + 1
    }
    return result
}