package edu.nazarov.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_374_GuessNumberHigherOrLowerTest {
    @Test
    void test1() {
        final int expected = 1;

        var solver = new Solution_374_GuessNumberHigherOrLower() {
            @Override
            protected int guess(int num) {
                return Integer.compare(expected, num);
            }
        };

        Assertions.assertEquals(expected, solver.guessNumber(1));
    }

    @Test
    void test2() {
        final int expected = 6;

        var solver = new Solution_374_GuessNumberHigherOrLower() {
            @Override
            protected int guess(int num) {
                return Integer.compare(expected, num);
            }
        };

        Assertions.assertEquals(expected, solver.guessNumber(10));
    }

    @Test
    void test3() {
        final int expected = 1;

        var solver = new Solution_374_GuessNumberHigherOrLower() {
            @Override
            protected int guess(int num) {
                return Integer.compare(expected, num);
            }
        };

        Assertions.assertEquals(expected, solver.guessNumber(2));
    }

    @Test
    void test4() {
        final int expected = 2;

        var solver = new Solution_374_GuessNumberHigherOrLower() {
            @Override
            protected int guess(int num) {
                return Integer.compare(expected, num);
            }
        };

        Assertions.assertEquals(expected, solver.guessNumber(2));
    }
}
