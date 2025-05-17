package edu.nazarov.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_3_Longest_Substring_Without_Repeating_CharactersTest {
    private static final Solution_3_Longest_Substring_Without_Repeating_Characters solver
            = new Solution_3_Longest_Substring_Without_Repeating_Characters();

    @Test
    void test1() {
        var input = "abcabcbb";
        var expected = 3;
        var actual = solver.lengthOfLongestSubstring(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var input = "bbbbb";
        var expected = 1;
        var actual = solver.lengthOfLongestSubstring(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var input = "pwwkew";
        var expected = 3;
        var actual = solver.lengthOfLongestSubstring(input);

        Assertions.assertEquals(expected, actual);
    }
}