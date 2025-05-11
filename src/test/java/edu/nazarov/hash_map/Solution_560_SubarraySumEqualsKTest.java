package edu.nazarov.hash_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_560_SubarraySumEqualsKTest {
    private static final Solution_560_SubarraySumEqualsK solver = new Solution_560_SubarraySumEqualsK();

    @Test
    void test1() {
        var given = new int[]{1, 1, 1, 1, 1, 1};
        var target = 3;

        var expected = 4;

        Assertions.assertEquals(expected, solver.subarraySum(given, target));
    }

    @Test
    void test2() {
        var given = new int[]{1, 1, 1};
        var target = 2;

        var expected = 2;

        Assertions.assertEquals(expected, solver.subarraySum(given, target));
    }

    @Test
    void test3() {
        var given = new int[]{1, 2, 3};
        var target = 3;

        var expected = 2;

        Assertions.assertEquals(expected, solver.subarraySum(given, target));
    }
}