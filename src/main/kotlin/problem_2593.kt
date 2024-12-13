package edu.nazarov

import java.util.*

fun findScore(nums: IntArray): Long {
    val queue = PriorityQueue<Pair<Int, Int>>(nums.size) { a, b ->
        when {
            a.first == b.first -> a.second - b.second
            else -> a.first - b.first
        }
    }

    val visited = mutableSetOf<Int>()

    nums.forEachIndexed { index, num ->
        queue.add(Pair(num, index))
    }

    var result = 0L
    while (!queue.isEmpty()) {
        val (num, index) = queue.poll()
        if (visited.add(index)) {
            result += num
            visited.add(index + 1)
            visited.add(index - 1)
        }
    }

    return result
}