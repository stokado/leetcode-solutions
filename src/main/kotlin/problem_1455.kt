package edu.nazarov

fun isPrefixOfWord(sentence: String, searchWord: String): Int {
    val words = sentence.split(" ")
    words.forEachIndexed { index, word ->
        if (word.startsWith(searchWord)) {
            return index + 1
        }
    }

    return -1
}