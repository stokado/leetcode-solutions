package edu.nazarov.sliding_window;

import java.util.HashMap;
import java.util.Map;

/*
Дан массив целых чисел, нужно найти непустой подотрезок (непрерывную последовательность)
с заданной суммой `target`, либо сказать, что это невозможно.

`findTarget([9, 6, 5, 1, 4, 2], 10)` -> (2, 4)
Time: O(n)
Space: O(1)
 */
public class YaFindTargetSubSequenceSolution {
    public int[] findTarget(int[] nums, int target) {
        int sum = 0;
        int start = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (start == Integer.MIN_VALUE) {
                start = i;
            }

            if (sum == target) {
                return new int[]{start, i};
            } else if (sum > target) {
                start = Integer.MIN_VALUE;
                sum = 0;
            }
        }

        return new int[]{-1, -1};
    }

    public int[] findTargetWithPrefixSum(int[] nums, int target) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, -1);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (prefixSum.containsKey(sum - target)) {
                int start = prefixSum.get(sum - target) + 1;
                return new int[]{start, i};
            }

            prefixSum.put(sum, i);
        }

        return new int[]{-1, -1};
    }
}
