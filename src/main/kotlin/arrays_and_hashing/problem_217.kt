package edu.nazarov.arrays_and_hashing

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = HashSet<Int>()
    for (num in nums) {
        seen.add(num)
    }

    return seen.size != nums.size
}