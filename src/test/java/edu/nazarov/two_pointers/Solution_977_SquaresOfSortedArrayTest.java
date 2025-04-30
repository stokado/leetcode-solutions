package edu.nazarov.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_977_SquaresOfSortedArrayTest {
    private static final Solution_977_SquaresOfSortedArray solver = new Solution_977_SquaresOfSortedArray();

    @Test
    void test1() {
        int[] expected = {0, 1, 9, 16, 100};
        int[] actual = solver.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] expected = {4, 9, 9, 49, 121};
        int[] actual = solver.sortedSquares(new int[]{-7, -3, 2, 3, 11});
        Assertions.assertArrayEquals(expected, actual);
    }
}
