package edu.nazarov.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_161_One_Edit_DistanceTest {
    private static final Solution_161_One_Edit_Distance solver = new Solution_161_One_Edit_Distance();

    @Test
    void test1() {
        String s = "ab";
        String t = "acb";

        Assertions.assertTrue(solver.isOneEditDistance(s, t));
    }

    @Test
    void test2() {
        String s = "";
        String t = "";

        Assertions.assertFalse(solver.isOneEditDistance(s, t));
    }

    @Test
    void test3() {
        String s = "ab";
        String t = "abc";

        Assertions.assertTrue(solver.isOneEditDistance(s, t));
    }

    @Test
    void test4() {
        String s = "abc";
        String t = "bc";

        Assertions.assertTrue(solver.isOneEditDistance(s, t));
    }

    @Test
    void test5() {
        String s = "1203";
        String t = "1213";

        Assertions.assertTrue(solver.isOneEditDistance(s, t));
    }

    @Test
    void test6() {
        String s = "120311";
        String t = "1213";

        Assertions.assertFalse(solver.isOneEditDistance(s, t));
    }
}