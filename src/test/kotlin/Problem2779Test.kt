import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2779Test {
    @Test
    fun `sample 1 should return 3`() {
        val actual = maximumBeauty(intArrayOf(4, 6, 1, 2), 2)
        assertEquals(3, actual)
    }

    @Test
    fun `sample 2 should return 4`() {
        val actual = maximumBeauty(intArrayOf(1, 1, 1, 1), 10)
        assertEquals(4, actual)
    }
}