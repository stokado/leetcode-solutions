package edu.nazarov.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_53_Maximum_SubarrayTest {
    private static final Solution_53_Maximum_Subarray solver = new Solution_53_Maximum_Subarray();

    @Test
    void test1() {
        var input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        var expected = 6;

        var actual = solver.maxSubArray(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var input = new int[]{1};
        var expected = 1;

        var actual = solver.maxSubArray(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var input = new int[]{5, 4, -1, 7, 8};
        var expected = 23;

        var actual = solver.maxSubArray(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test4() {
        var input = new int[]{-1};
        var expected = -1;

        var actual = solver.maxSubArray(input);

        Assertions.assertEquals(expected, actual);
    }
}