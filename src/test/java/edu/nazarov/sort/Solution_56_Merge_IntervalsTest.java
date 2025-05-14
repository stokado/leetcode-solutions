package edu.nazarov.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Solution_56_Merge_IntervalsTest {
    private static final Solution_56_Merge_Intervals solution = new Solution_56_Merge_Intervals();

    @Test
    void test1() {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        var actual = solution.merge(intervals);

        Assertions.assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    void test2() {
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};

        int[][] expected = new int[][]{{1, 5}};
        var actual = solution.merge(intervals);

        Assertions.assertTrue(Arrays.deepEquals(expected, actual));
    }

}