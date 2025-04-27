package edu.nazarov.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Solution_704_BinarySearchTest {
    private final Solution_704_BinarySearch solver = new Solution_704_BinarySearch();

    @Test
    void test1() {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int expected = Arrays.binarySearch(arr, target);
        int actual = solver.search(arr, target);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int expected = -1;
        int actual = solver.search(arr, target);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] arr = {-1};
        int target = 2;

        int expected = -1;
        int actual = solver.search(arr, target);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test4() {
        int[] arr = {-1};
        int target = -1;

        int expected = Arrays.binarySearch(arr, target);
        int actual = solver.search(arr, target);

        Assertions.assertEquals(expected, actual);
    }
}
