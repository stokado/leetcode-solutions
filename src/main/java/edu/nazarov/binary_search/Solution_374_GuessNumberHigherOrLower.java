package edu.nazarov.binary_search;

/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.
 */
public class Solution_374_GuessNumberHigherOrLower {
    /*
    Use Binary Search algorithm with a call to the "guess" function

    Time: O(log n)
    Space: O(1)
     */
    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int guess = guess(mid);

            if (guess == 0) {
                return mid;
            } else if (guess > 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    protected int guess(int num) {
        throw new UnsupportedOperationException("guess() not implemented");
    }
}
