import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2182Test {
    @Test
    fun `sample 1 should return zzcccac`() {
        val actual = repeatLimitedString("cczazcc", 3)
        assertEquals("zzcccac", actual)
    }

    @Test
    fun `sample 2 should return bbabaa`() {
        val actual = repeatLimitedString("aababab", 2)
        assertEquals("bbabaa", actual)
    }
}