package edu.nazarov.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_11_ContainerWithMostWaterTest {
    private static final Solution_11_ContainerWithMostWater solver = new Solution_11_ContainerWithMostWater();

    @Test
    void test1() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int actual = solver.maxArea(input);

        Assertions.assertEquals(49, actual);
    }

    @Test
    void test2() {
        int[] input = new int[]{1, 1};
        int actual = solver.maxArea(input);

        Assertions.assertEquals(1, actual);
    }
}
