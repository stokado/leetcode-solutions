import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2593Test {
    @Test
    fun `sample 1 should return 7`() {
        val actual = findScore(intArrayOf(2, 1, 3, 4, 5, 2))
        assertEquals(7, actual)
    }

    @Test
    fun `sample 2 should return 5`() {
        val actual = findScore(intArrayOf(2, 3, 5, 1, 3, 2))
        assertEquals(5, actual)
    }

    @Test
    fun `sample 3 should return 3`() {
        val actual = findScore(intArrayOf(3))
        assertEquals(3, actual)
    }

    @Test
    fun `sample 4 should return 3`() {
        val actual = findScore(intArrayOf(3, 6))
        assertEquals(3, actual)
    }
}