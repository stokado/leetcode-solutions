package edu.nazarov.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Solution_3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;

        Map<Character, Integer> charToIndex = new HashMap<>();

        for (int end = 0; end < s.length(); ++end) {
            char c = s.charAt(end);

            if (charToIndex.containsKey(c)) {
                start = Math.max(start, charToIndex.get(c) + 1);
            }

            charToIndex.put(c, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
