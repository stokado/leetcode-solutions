import edu.nazarov.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem3264Test {
    @Test
    fun `sample 1`() {
        val expected = intArrayOf(8, 4, 6, 5, 6)
        val actual = getFinalState(intArrayOf(2, 1, 3, 5, 6), 5, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `sample 2`() {
        val expected = intArrayOf(16, 8)
        val actual = getFinalState(intArrayOf(1, 2), 3, 4)
        assertArrayEquals(expected, actual)
    }
}