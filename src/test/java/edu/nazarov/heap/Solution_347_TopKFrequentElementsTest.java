package edu.nazarov.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_347_TopKFrequentElementsTest {
    private static final Solution_347_TopKFrequentElements solver = new Solution_347_TopKFrequentElements();

    @Test
    void test1() {
        int[] expected = {1, 2};
        int[] actual = solver.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] expected = {1};
        int[] actual = solver.topKFrequent(new int[]{1}, 1);
        Assertions.assertArrayEquals(expected, actual);
    }
}
