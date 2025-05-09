package edu.nazarov.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_74_SearchA2DMatrixTest {
    private static final Solution_74_SearchA2DMatrix solver = new Solution_74_SearchA2DMatrix();

    @Test
    void test1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        Assertions.assertTrue(solver.searchMatrix(matrix, 3));
    }
}
