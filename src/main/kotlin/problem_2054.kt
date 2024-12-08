package edu.nazarov

import kotlin.math.*


fun maxTwoEvents(events: Array<IntArray>): Int {
    events.sortBy { it.first() }
    val n = events.size
    val maxSuffix = IntArray(n)
    maxSuffix[n - 1] = events[n - 1].last()
    for (i in n - 2 downTo 0) {
        maxSuffix[i] = max(maxSuffix[i + 1], events[i].last())
    }

    fun binarySearch(left: Int, right: Int, target: Int): Int {
        if (left >= right) {
            return right
        }

        val mid = left + (right - left) / 2
        return if (events[mid].first() > target) {
            binarySearch(left, mid, target)
        } else {
            binarySearch(mid + 1, right, target)
        }
    }

    return events.indices.maxOf { i ->
        events[i].last() + binarySearch(i + 1, n, events[i][1]).let { if (it < n) maxSuffix[it] else 0 }
    }
}