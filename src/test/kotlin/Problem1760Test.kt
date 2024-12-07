import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem1760Test {
    @Test
    fun `sample input 1 should return 3`() {
        val input = intArrayOf(9)
        val maxOperations = 2

        val actual = minimumSize(input, maxOperations)

        assertEquals(3, actual)
    }

    @Test
    fun `sample input 2 should return 2`() {
        val input = intArrayOf(2, 4, 8, 2)
        val maxOperations = 4

        val actual = minimumSize(input, maxOperations)

        assertEquals(2, actual)
    }

    @Test
    fun `sample input 3 should return 500000000`() {
        val input = intArrayOf(1000000000)
        val maxOperations = 1

        val actual = minimumSize(input, maxOperations)

        assertEquals(500000000, actual)
    }
}