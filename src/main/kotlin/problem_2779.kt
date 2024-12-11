package edu.nazarov

fun maximumBeauty(nums: IntArray, k: Int): Int {
    val sorted = nums.sorted()
    var left = 0
    val threshold = k * 2

    for (num in sorted) {
        if (threshold < num - sorted[left]) {
            left++
        }
    }

    return sorted.size - left
}