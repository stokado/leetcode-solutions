package edu.nazarov.bit_ops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_136_SingleNumberTest {
    private static final Solution_136_SingleNumber solver = new Solution_136_SingleNumber();

    @Test
    void test1() {
        int expected = 1;
        int actual = solver.singleNumber(new int[]{2, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int expected = 4;
        int actual = solver.singleNumber(new int[]{4, 1, 2, 1, 2});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int expected = 1;
        int actual = solver.singleNumber(new int[]{1});
        Assertions.assertEquals(expected, actual);
    }
}
