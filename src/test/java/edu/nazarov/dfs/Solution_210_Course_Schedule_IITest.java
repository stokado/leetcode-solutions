package edu.nazarov.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_210_Course_Schedule_IITest {
    private static final Solution_210_Course_Schedule_II solution = new Solution_210_Course_Schedule_II();

    @Test
    void test1() {
        int n = 2;
        int[][] prerequisites = new int[][]{
                {1, 0},
        };

        int[] expected = new int[]{0, 1};
        int[] actual = solution.findOrder(n, prerequisites);

        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int n = 4;
        int[][] prerequisites = new int[][]{
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2},
        };

        int[] expected = new int[]{0, 1, 2, 3};
        int[] actual = solution.findOrder(n, prerequisites);

        assertArrayEquals(expected, actual);
    }
}