package edu.nazarov.linked_list;

import com.google.common.collect.Lists;
import edu.nazarov.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Solution_206_ReverseLinkedListTest {
    private final Solution_206_ReverseLinkedList solver = new Solution_206_ReverseLinkedList();

    @Test
    void test1() {
        Assertions.assertNull(solver.reverseList(null));
    }

    @Test
    void test2() {
        ListNode<Integer> head = new ListNode<>(1);
        Assertions.assertEquals(head, solver.reverseList(head));
    }

    @Test
    void test3() {
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> expected = Lists.reverse(list);

        ListNode<Integer> head = ListNode.fromList(list);
        List<Integer> actual = ListNode.toList(solver.reverseList(head));

        Assertions.assertEquals(expected, actual);
    }
}
