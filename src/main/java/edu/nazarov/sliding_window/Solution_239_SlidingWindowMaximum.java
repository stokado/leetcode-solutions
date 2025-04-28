package edu.nazarov.sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;

/*
You are given an array of integers nums; there is a sliding window of size k,
which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.
 */
public class Solution_239_SlidingWindowMaximum {
    /*
    Straight forward approach
    "Build" the window and find maximum in each window

    Time: O(kn)
    Space: O(n - k) (excluding the result O(1))
     */
    public int[] maxSlidingWindowBruteForce(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length - k + 1; i++) {
            result[i] = findMax(nums, i, i + k);
        }

        return result;
    }

    /*
    Use deque to store indices of a current window and keep only the biggest number in deque before
    appending the result

    Time: O(n)
    Space: O(n - k) (excluding the result O(1))
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>(); // store indices
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            // Only keep indices inside the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1 ) {
                deque.poll();
            }

            // Remove all numbers that are smaller than the current value
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index to deque
            deque.offer(i);
            // If we've reached an index, of window size, then start to fill the result array
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peek()];
            }
        }

        return result;
    }

    private int findMax(int[] nums, int start, int end) {
        int max = nums[start];

        for (int i = start + 1; i < end; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
