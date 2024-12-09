import edu.nazarov.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem3152Test {
    @Test
    fun `given sample 1 should return single false`() {
        val actual = isArraySpecial(intArrayOf(3, 4, 1, 2, 6), arrayOf(intArrayOf(0, 4)))
        val expected = booleanArrayOf(false)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `given sample 2 should return single false, true`() {
        val actual = isArraySpecial(intArrayOf(4, 3, 1, 6), arrayOf(intArrayOf(0, 2), intArrayOf(2, 3)))
        val expected = booleanArrayOf(false, true)
        assertArrayEquals(expected, actual)
    }
}