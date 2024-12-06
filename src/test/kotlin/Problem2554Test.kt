import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2554Test {
    @Test
    fun `example 1 should return 2`() {
        val actual = maxCount(intArrayOf(1, 6, 5), 5, 6)
        assertEquals(2, actual)
    }

    @Test
    fun `example 2 should return 0`() {
        val actual = maxCount(intArrayOf(1, 2, 3, 4, 5, 6, 7), 8, 1)
        assertEquals(0, actual)
    }

    @Test
    fun `example 3 should return 7`() {
        val actual = maxCount(intArrayOf(11), 7, 50)
        assertEquals(7, actual)
    }
}