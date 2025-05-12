package edu.nazarov.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

class YaUnionOrderedListsSolutionTest {
    private static final YaUnionOrderedListsSolution solver = new YaUnionOrderedListsSolution();

    @Test
    void test1() {
        int[] a = new int[]{1, 2, 4, 6, 6, 8, 91};
        int[] b = new int[]{1, 5, 6, 10};

        var actual = solver.unionLists(a, b);
        var expected = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .toArray();

        Assertions.assertArrayEquals(expected, actual);
    }
}