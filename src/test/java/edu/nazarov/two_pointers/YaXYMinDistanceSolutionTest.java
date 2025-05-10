package edu.nazarov.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YaXYMinDistanceSolutionTest {
    private static final YaXYMinDistanceSolution solver = new YaXYMinDistanceSolution();

    @Test
    void test1() {
        var given = "XY";
        var result = solver.minDistance(given);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test2() {
        var given = "YX";
        var result = solver.minDistance(given);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test3() {
        var given = "OOOXOOYOXO";
        var result = solver.minDistance(given);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test4() {
        var given = "OOOXXOY";
        var result = solver.minDistance(given);
        Assertions.assertEquals(2, result);
    }
}
