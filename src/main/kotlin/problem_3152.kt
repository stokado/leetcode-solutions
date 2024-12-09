package edu.nazarov

fun isArraySpecial(nums: IntArray, queries: Array<IntArray>): BooleanArray {
    val n = nums.size
    val prefixCount = IntArray(n)

    prefixCount[0] = 0

    var previousParity = nums[0] % 2
    for (i in 1 until n) {
        val currentParity = nums[i] % 2
        prefixCount[i] = prefixCount[i - 1] + if (currentParity != previousParity) 1 else 0
        previousParity = currentParity
    }
    val result = BooleanArray(queries.size)

    for (i in queries.indices) {
        val start = queries[i][0]
        val end = queries[i][1]

        val expected = end - start
        val actual = prefixCount[end] - prefixCount[start]
        result[i] = expected == actual
    }
    return result
}