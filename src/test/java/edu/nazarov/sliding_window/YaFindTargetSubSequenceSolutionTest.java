package edu.nazarov.sliding_window;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class YaFindTargetSubSequenceSolutionTest {
    private static final YaFindTargetSubSequenceSolution solver = new YaFindTargetSubSequenceSolution();

    @Test
    void test1() {
        int[] nums = new int[]{9, 6, 5, 1, 4, 2};
        int target = 10;

        int[] expected = new int[]{2, 4};

        int[] actual = solver.findTarget(nums, target);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] nums = new int[]{-5, 4, 5, 1, 4, 2};
        int target = -1;

        int[] expected = new int[]{0, 1};

        int[] actual = solver.findTarget(nums, target);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test1PrefixSum() {
        int[] nums = new int[]{9, 6, 5, 1, 4, 2};
        int target = 10;

        int[] expected = new int[]{2, 4};

        int[] actual = solver.findTargetWithPrefixSum(nums, target);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2PrefixSum() {
        int[] nums = new int[]{-5, 4, 5, 1, 4, 2};
        int target = -1;

        int[] expected = new int[]{0, 1};

        int[] actual = solver.findTargetWithPrefixSum(nums, target);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test3PrefixSum() {
        int[] nums = new int[]{1, -1, 5, -2, 3};
        int target = -1;

        int[] expected = new int[]{1, 1};

        int[] actual = solver.findTargetWithPrefixSum(nums, target);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test4PrefixSum() {
        int[] nums = new int[]{3, 4, -7, 5, -6, 2};
        int target = 0;

        int[] expected = new int[]{0, 2};

        int[] actual = solver.findTargetWithPrefixSum(nums, target);

        Assertions.assertArrayEquals(expected, actual);
    }
}