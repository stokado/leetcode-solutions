import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem1792Test {
    @Test
    fun `sample 1`() {
        val actual = maxAverageRatio(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 5),
                intArrayOf(2, 2)
            ), 2
        )
        assertEquals(0.78333, actual, 0.00001)
    }

    @Test
    fun `sample 2`() {
        val actual = maxAverageRatio(
            arrayOf(
                intArrayOf(2, 4),
                intArrayOf(3, 9),
                intArrayOf(4, 5),
                intArrayOf(2, 10)
            ), 4
        )
        assertEquals(0.53485, actual, 0.00001)
    }
}