package edu.nazarov

import java.util.PriorityQueue

fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
    val heap = PriorityQueue<Pair<Int, Int>>(nums.size) { a, b ->
        when {
            a.first == b.first -> a.second.compareTo(b.second)
            else -> a.first.compareTo(b.first)
        }
    }

    nums.forEachIndexed { index, num ->
        heap.offer(Pair(num, index))
    }

    for (i in 1..k) {
        val current = heap.poll()
        val newValue = nums[current.second] * multiplier
        nums[current.second] = newValue
        heap.offer(Pair(newValue, current.second))
    }

    return nums
}