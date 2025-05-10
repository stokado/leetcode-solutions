package edu.nazarov.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YaSummaryRangesSolutionTest {
    private static final YaSummaryRangesSolution solver = new YaSummaryRangesSolution();

    @Test
    void test1() {
        int[] array = {1, 4, 5, 2, 3, 9, 8, 11, 0};

        String actual = solver.summaryRanges(array);

        Assertions.assertEquals("0-5,8-9,11", actual);
    }

    @Test
    void test2() {
        int[] array = {1, 4, 3, 2};

        String actual = solver.summaryRanges(array);

        Assertions.assertEquals("1-4", actual);
    }

    @Test
    void test3() {
        int[] array = {1, 4};

        String actual = solver.summaryRanges(array);

        Assertions.assertEquals("1,4", actual);
    }
}
