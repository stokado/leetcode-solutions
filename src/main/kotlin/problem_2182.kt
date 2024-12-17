package edu.nazarov

import java.util.*
import kotlin.math.*


fun repeatLimitedString(s: String, repeatLimit: Int): String {
    val freq = mutableMapOf<Char, Int>()
    for (char in s) {
        freq[char] = freq.getOrDefault(char, 0) + 1
    }

    val maxHeap = PriorityQueue<Char>{ a, b ->
        b.compareTo(a)
    }

    for (ch in freq.keys) {
        maxHeap.offer(ch)
    }

    val result = StringBuilder()

    while (!maxHeap.isEmpty()) {
        val ch = maxHeap.poll()
        val count = freq[ch]!!

        val use = min(count, repeatLimit)
        for (i in 0..<use) {
            result.append(ch)
        }

        freq[ch] = count - use

        if (freq[ch]!! > 0 && !maxHeap.isEmpty()) {
            val nextCh = maxHeap.poll()
            result.append(nextCh)
            freq[nextCh] = freq[nextCh]!! - 1
            if (freq[nextCh]!! > 0) {
                maxHeap.offer(nextCh)
            }
            maxHeap.offer(ch)
        }
    }

    return result.toString()
}