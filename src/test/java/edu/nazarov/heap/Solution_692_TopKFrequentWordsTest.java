package edu.nazarov.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Solution_692_TopKFrequentWordsTest {
    private static final Solution_692_TopKFrequentWords solver = new Solution_692_TopKFrequentWords();

    @Test
    void test1() {
        var actual = solver.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);

        var expected = List.of("i", "love");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var actual = solver.topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4);

        var expected = List.of("the","is","sunny","day");

        Assertions.assertEquals(expected, actual);
    }
}
