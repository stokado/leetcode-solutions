package edu.nazarov.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_121_Best_TIme_To_Buy_And_Sell_StockTest {
    private static final Solution_121_Best_Time_To_Buy_And_Sell_Stock solver = new Solution_121_Best_Time_To_Buy_And_Sell_Stock();

    @Test
    void test1() {
        var input = new int[]{7, 1, 5, 3, 6, 4};
        var expected = 5;

        var actual = solver.maxProfit(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var input = new int[]{7, 6, 4, 3, 1};
        var expected = 0;

        var actual = solver.maxProfit(input);

        Assertions.assertEquals(expected, actual);
    }
}