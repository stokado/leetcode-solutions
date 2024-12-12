package edu.nazarov

import java.util.*
import kotlin.math.*

fun pickGifts(gifts: IntArray, k: Int): Long {
    val queue = PriorityQueue<Int>(gifts.size, Collections.reverseOrder())
    gifts.forEach { gift ->
        queue.add(gift)
    }

    repeat (k) {
        val largestGift = queue.poll()
        val square = floor(sqrt(largestGift.toDouble()))
        queue.add(square.toInt())
    }

    return queue.sumOf { it.toLong() }
}