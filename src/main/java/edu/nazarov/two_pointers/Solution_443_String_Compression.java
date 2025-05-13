package edu.nazarov.two_pointers;

/*
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

* If the group's length is 1, append the character to s.
* Otherwise, append the character followed by the group's length.

The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Time: O(n)
Space: O(1)
 */
public class Solution_443_String_Compression {
    public int compress(char[] chars) {
        int writeIndex = 0;
        int readIndex = 0;
        int n = chars.length;

        while (readIndex < n) {
            char currentChar = chars[readIndex];
            int count = 0;

            while (readIndex < n && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            chars[writeIndex++] = currentChar;

            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[writeIndex++] = c;
                }
            }
        }

        return writeIndex;
    }
}
