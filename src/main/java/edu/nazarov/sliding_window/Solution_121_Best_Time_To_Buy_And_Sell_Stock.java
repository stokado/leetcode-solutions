package edu.nazarov.sliding_window;

public class Solution_121_Best_Time_To_Buy_And_Sell_Stock {
    /*
    Use sliding window technique

    If price[l] < price[r]
        then calculate profit, compare it with the current max
    else
        l = r

    r++

    Time: O(n)
    Space: O(1)
     */
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 0;

        int maxProfit = 0;

        while (sellDay < prices.length) {
            if (prices[buyDay] < prices[sellDay]) {
                int profit = prices[sellDay] - prices[buyDay];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyDay = sellDay;
            }
            sellDay++;
        }

        return maxProfit;
    }
}
