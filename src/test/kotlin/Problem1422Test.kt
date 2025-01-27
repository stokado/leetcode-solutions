import edu.nazarov.maxScore
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem1422Test {
    @Test
    fun testCaseOne() {
        val string = "011101"
        val actual = maxScore(string)
        val expected = 5

        assertEquals(expected, actual)
    }

    @Test
    fun testCaseTwo() {
        val string = "000111"
        val actual = maxScore(string)
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testCaseThree() {
        val string = "1111"
        val actual = maxScore(string)
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testCaseFour() {
        val string = "00"
        val actual = maxScore(string)
        val expected = 1

        assertEquals(expected, actual)
    }

}