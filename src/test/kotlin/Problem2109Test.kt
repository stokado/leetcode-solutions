import edu.nazarov.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem2109Test {

    @Test
    fun `given String add 2 spaces`() {
        val expected = "Enjoy Your Coffee"
        val actual = addSpaces("EnjoyYourCoffee", intArrayOf(5, 9))
        val actual2 = addSpaces2("EnjoyYourCoffee", intArrayOf(5, 9))

        assertEquals(expected, actual)
        assertEquals(expected, actual2)
    }

    @Test
    fun `given String add 3 spaces`() {
        val expected = "Leetcode Helps Me Learn"
        val actual = addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8, 13, 15))
        val actual2 = addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8, 13, 15))

        assertEquals(expected, actual)
        assertEquals(expected, actual2)
    }

    @Test
    fun `given String add 4 spaces`() {
        val expected = "i code in py thon"
        val actual = addSpaces("icodeinpython", intArrayOf(1, 5, 7, 9))
        val actual2 = addSpaces("icodeinpython", intArrayOf(1, 5, 7, 9))

        assertEquals(expected, actual)
        assertEquals(expected, actual2)
    }

    @Test
    fun `given String add 7 spaces`() {
        val expected = " s p a c i n g"
        val actual = addSpaces("spacing", intArrayOf(0, 1, 2, 3, 4, 5, 6))
        val actual2 = addSpaces("spacing", intArrayOf(0, 1, 2, 3, 4, 5, 6))

        assertEquals(expected, actual)
        assertEquals(expected, actual2)
    }
}