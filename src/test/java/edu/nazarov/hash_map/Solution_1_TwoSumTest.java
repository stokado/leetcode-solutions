package edu.nazarov.hash_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_1_TwoSumTest {
    private static final Solution_1_TwoSum solver = new Solution_1_TwoSum();

    @Test
    void test1() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSum(input, target);
        int[] expected = {1, 0};

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void test2() {
        int[] input = {3,2,4};
        int target = 6;
        int[] result = solver.twoSum(input, target);
        int[] expected = {2, 1};

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void test3() {
        int[] input = {3, 3};
        int target = 6;
        int[] result = solver.twoSum(input, target);
        int[] expected = {1, 0};

        Assertions.assertArrayEquals(expected, result);
    }
}
