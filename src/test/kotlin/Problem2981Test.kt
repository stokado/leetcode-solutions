import edu.nazarov.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Problem2981Test {
    @Test
    fun `test sample 1 should return 2`() {
        assertEquals(2, maximumLength("aaaa"))
    }

    @Test
    fun `test sample 2 should return -1`() {
        assertEquals(-1, maximumLength("abcdef"))
    }

    @Test
    fun `test sample 3 should return 1`() {
        assertEquals(1, maximumLength("abcaba"))
    }
}