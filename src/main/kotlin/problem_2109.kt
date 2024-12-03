package edu.nazarov

// Initial Solution
fun addSpaces(s: String, spaces: IntArray): String {
    val chars = s.toMutableList()
    for ((offset, index) in spaces.withIndex()) {
        chars.add(index + offset, ' ')
    }
    return String(chars.toCharArray())
}

fun addSpaces2(s: String, spaces: IntArray): String {
    val spacedString = StringBuilder()
    var spacesIndex = 0
    for (i in 0..s.lastIndex) {
        if (spacesIndex < spaces.size && spaces[spacesIndex] == i) {
            spacedString.append(' ')
            spacesIndex++
        }
        spacedString.append(s[i])
    }
    return spacedString.toString()
}