import edu.nazarov.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class Problem2337Test {
    @Test
    fun `given right input should return true`() {
        val start = "_L__R__R_"
        val end = "L______RR"

        assertTrue(canChange(start, end))
    }

    @Test
    fun `given right input should return true2`() {
        val start = "_L"
        val end = "L_"

        assertTrue(canChange(start, end))
    }

    @Test
    fun `given right input should return true3`() {
        val start = "R_"
        val end = "_R"

        assertTrue(canChange(start, end))
    }

    @Test
    fun `given wrong input should return false`() {
        val start = "R_L_"
        val end = "__LR"

        assertFalse(canChange(start, end))
    }

    @Test
    fun `given wrong input should return false2`() {
        val start = "_R"
        val end = "R_"

        assertFalse(canChange(start, end))
    }

    @Test
    fun `given wrong input should return false3`() {
        val start = "L_"
        val end = "_L"

        assertFalse(canChange(start, end))
    }
}