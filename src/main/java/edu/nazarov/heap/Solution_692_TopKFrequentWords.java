package edu.nazarov.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest.
Sort the words with the same frequency by their lexicographical order.
 */
public class Solution_692_TopKFrequentWords {
    /*
    We can use Heap (priority queue)

    1) Count words frequencies
    2) Use Heap to sort words by
        2.1) frequency
        2.2) lexicographical order
    3) Builds result by popping k elements from heap
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencies = new HashMap<>();

        for (String word : words) {
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
        }

        Comparator<Map.Entry<String, Integer>> comparator =
                Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                        .thenComparing((a, b) -> b.getKey().compareTo(a.getKey()));
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(comparator);

        for (var entry : frequencies.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        List<String> result = new ArrayList<>(k);
        while (!heap.isEmpty()) {
            result.add(0, heap.poll().getKey());
        }

        return result;
    }
}
