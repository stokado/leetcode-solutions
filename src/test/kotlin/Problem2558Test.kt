import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2558Test {
    @Test
    fun `sample 1 should return 29`() {
        val actual = pickGifts(intArrayOf(25, 64, 9, 4, 100), 4)
        assertEquals(29, actual)
    }

    @Test
    fun `sample 2 should return 4`() {
        val actual = pickGifts(intArrayOf(1, 1, 1, 1), 4)
        assertEquals(4, actual)
    }
}