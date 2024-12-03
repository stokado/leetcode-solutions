package arrays_and_hashing

import edu.nazarov.arrays_and_hashing.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem217Test {
    @Test
    fun `containsDuplicate should return true for array with duplicates`() {
        val nums = intArrayOf(1, 2, 3, 4, 1)
        val result = containsDuplicate(nums)
        assertTrue(result, "Expected true because the array contains duplicates")
    }

    @Test
    fun `containsDuplicate should return false for array without duplicates`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val result = containsDuplicate(nums)
        assertFalse(result, "Expected false because the array does not contain duplicates")
    }
}