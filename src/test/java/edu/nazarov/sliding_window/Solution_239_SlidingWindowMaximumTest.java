package edu.nazarov.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_239_SlidingWindowMaximumTest {
    private static final Solution_239_SlidingWindowMaximum solver = new Solution_239_SlidingWindowMaximum();

    @Test
    public void testBruteForce1() {
        int[] expected = {3, 3, 5, 5, 6, 7};

        int[] actual = solver.maxSlidingWindowBruteForce(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBruteForce2() {
        int[] expected = {1};

        int[] actual = solver.maxSlidingWindowBruteForce(new int[]{1}, 1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[] expected = {3, 3, 5, 5, 6, 7};

        int[] actual = solver.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] expected = {1};

        int[] actual = solver.maxSlidingWindow(new int[]{1}, 1);

        Assertions.assertArrayEquals(expected, actual);
    }
}
