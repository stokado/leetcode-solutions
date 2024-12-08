import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2054Test {
    @Test
    fun `given sample 1 should return 4`() {
        val input = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(2, 4, 3))
        val actual = maxTwoEvents(input)
        assertEquals(4, actual)
    }

    @Test
    fun `given sample 2 should return 5`() {
        val input = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(1, 5, 5))
        val actual = maxTwoEvents(input)
        assertEquals(5, actual)
    }

    @Test
    fun `given sample 3 should return 8`() {
        val input = arrayOf(intArrayOf(1, 5, 3), intArrayOf(1, 5, 1), intArrayOf(6, 6, 5))
        val actual = maxTwoEvents(input)
        assertEquals(8, actual)
    }
}