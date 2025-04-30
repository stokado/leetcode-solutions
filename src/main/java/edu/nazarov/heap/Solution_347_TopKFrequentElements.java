package edu.nazarov.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution_347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elementToFrequency = new HashMap<>();

        for (int num : nums) {
            elementToFrequency.put(num, elementToFrequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Map.Entry.comparingByValue()
        );

        for (var entry : elementToFrequency.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for (int i = minHeap.size() - 1; i >= 0; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}
