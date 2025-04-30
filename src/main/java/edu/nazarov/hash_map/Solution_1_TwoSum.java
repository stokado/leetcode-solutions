package edu.nazarov.hash_map;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class Solution_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (numToIndex.containsKey(rest)) {
                result[0] = i;
                result[1] = numToIndex.get(rest);
            }
            numToIndex.put(nums[i], i);
        }

        return result;
    }
}
