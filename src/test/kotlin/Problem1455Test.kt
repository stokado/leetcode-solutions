import edu.nazarov.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem1455Test {
    @Test
    fun `isPrefixOfWord should return index for given sentence`() {
        val sentence = "i love eating burger"
        val searchWord = "burg"

        assertEquals(4, isPrefixOfWord(sentence, searchWord))
    }

    @Test
    fun `isPrefixOfWord should return -1 for given sentence`() {
        val sentence = "i love eating burger"
        val searchWord = "hello"
        assertEquals(-1, isPrefixOfWord(sentence, searchWord))
    }

    @Test
    fun `isPrefixOfWord should return min index for sentence with duplicates`() {
        val sentence = "hello hello"
        val searchWord = "hello"
        assertEquals(1, isPrefixOfWord(sentence, searchWord))
    }
}