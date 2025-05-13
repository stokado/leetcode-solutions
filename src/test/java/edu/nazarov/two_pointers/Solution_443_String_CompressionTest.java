package edu.nazarov.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_443_String_CompressionTest {
    private static final Solution_443_String_Compression solver = new Solution_443_String_Compression();

    @Test
    void test1() {
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] expectedChars = {'a', '2', 'b', '2', 'c', '3'};
        int expectedLength = expectedChars.length;

        assertCompression(chars, expectedLength, expectedChars);
    }

    @Test
    void test2() {
        char[] chars = new char[]{'a'};
        char[] expectedChars = {'a'};
        int expectedLength = expectedChars.length;

        assertCompression(chars, expectedLength, expectedChars);
    }

    @Test
    void test3() {
        char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char[] expectedChars = {'a', 'b', '1', '2'};
        int expectedLength = expectedChars.length;

        assertCompression(chars, expectedLength, expectedChars);
    }

    @Test
    void test4() {
        char[] chars = new char[]{'a', 'a', 'a', 'a', 'b', 'c', 'c', 'd', 'f'};
        char[] expectedChars = {'a', '4', 'b', 'c', '2', 'd', 'f'};
        int expectedLength = expectedChars.length;

        assertCompression(chars, expectedLength, expectedChars);
    }

    private void assertCompression(char[] input, int expectedLength, char[] expectedChars) {
        int actualLength = solver.compress(input);
        Assertions.assertEquals(expectedLength, actualLength, "Length mismatch");

        for (int i = 0; i < expectedChars.length; i++) {
            Assertions.assertEquals(expectedChars[i], input[i], "Mismatch at index " + i);
        }
    }
}