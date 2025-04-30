package edu.nazarov.hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 */
public class Solution_49_GroupAnagrams {
    /*
    Iterate over all strs
    Group them by either
    1) Sorting the str
    2) Calculate frequencies of each character
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keyToGroup = new HashMap<>();

        for (String str : strs) {
            String key = calculateKey(str);
            List<String> anagrams = keyToGroup.getOrDefault(key, new LinkedList<>());
            anagrams.add(str);
            keyToGroup.putIfAbsent(key, anagrams);
        }

        return new ArrayList<>(keyToGroup.values());
    }

    private String calculateKey(String str) {
        char[] buckets = new char[26];
        for (var c : str.toCharArray()) {
            buckets[c - 'a']++;
        }
        return String.valueOf(buckets);
    }
}
