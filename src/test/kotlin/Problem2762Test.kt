import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2762Test {
    @Test
    fun `sample 1 should return 8`() {
        val actual = continuousSubarrays(intArrayOf(5,4,2,4))
        assertEquals(8, actual)
    }

    @Test
    fun `sample 2 should return 6`() {
        val actual = continuousSubarrays(intArrayOf(1,2,3))
        assertEquals(6, actual)
    }
}