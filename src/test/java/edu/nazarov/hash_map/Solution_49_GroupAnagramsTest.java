package edu.nazarov.hash_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_49_GroupAnagramsTest {
    private static final Solution_49_GroupAnagrams solver = new Solution_49_GroupAnagrams();

    @Test
    void test1() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        var expected = List.of(
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea"),
                List.of("bat")
        );

        var actual = solver.groupAnagrams(input);

        List<List<String>> sortedExpected = sortListOfLists(expected);
        List<List<String>> sortedActual = sortListOfLists(actual);

        Assertions.assertEquals(sortedExpected, sortedActual);
    }

    @Test
    void test2() {
        String[] input = {""};
        var expected = List.of(
                List.of("")
        );

        var actual = solver.groupAnagrams(input);

        List<List<String>> sortedExpected = sortListOfLists(expected);
        List<List<String>> sortedActual = sortListOfLists(actual);

        Assertions.assertEquals(sortedExpected, sortedActual);
    }

    @Test
    void test3() {
        String[] input = {"a"};
        var expected = List.of(
                List.of("a")
        );

        var actual = solver.groupAnagrams(input);

        List<List<String>> sortedExpected = sortListOfLists(expected);
        List<List<String>> sortedActual = sortListOfLists(actual);

        Assertions.assertEquals(sortedExpected, sortedActual);
    }

    private List<List<String>> sortListOfLists(List<List<String>> input) {
        List<List<String>> sorted = new ArrayList<>();
        for (List<String> group : input) {
            List<String> sortedGroup = new ArrayList<>(group);
            Collections.sort(sortedGroup);
            sorted.add(sortedGroup);
        }
        // Sort the outer list to make order of groups consistent
        sorted.sort(Comparator.comparing(Object::toString));
        return sorted;
    }
}
