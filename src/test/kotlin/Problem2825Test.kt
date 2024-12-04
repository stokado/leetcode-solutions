import edu.nazarov.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem2825Test {

    @Test
    fun canMakeSubsequence() {
        assertTrue(canMakeSubsequence("abc", "ad"))
    }

    @Test
    fun canMakeSubsequence2() {
        assertTrue(canMakeSubsequence("zc", "ad"))
    }

    @Test
    fun canMakeSubsequence3() {
        assertTrue(canMakeSubsequence("dm", "e"))
    }

    @Test
    fun cantMakeSubsequence() {
        assertFalse(canMakeSubsequence("ab", "d"))
    }

    @Test
    fun cantMakeSubsequence2() {
        assertFalse(canMakeSubsequence("c", "b"))
    }
}