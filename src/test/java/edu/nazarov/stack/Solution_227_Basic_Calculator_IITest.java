package edu.nazarov.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_227_Basic_Calculator_IITest {
    private static final Solution_227_Basic_Calculator_II solver = new Solution_227_Basic_Calculator_II();

    @Test
    void test1() {
        String input = "3+2*2";

        int expected = 7;

        int actual = solver.calculate(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String input = "3/2";

        int expected = 1;

        int actual = solver.calculate(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        String input = "3+5 / 2 ";

        int expected = 5;

        int actual = solver.calculate(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test4() {
        String input = "-1+3*2/3";

        int expected = 1;

        int actual = solver.calculate(input);

        Assertions.assertEquals(expected, actual);
    }
}