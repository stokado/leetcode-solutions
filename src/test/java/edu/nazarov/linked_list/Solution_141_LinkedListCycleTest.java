package edu.nazarov.linked_list;

import edu.nazarov.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_141_LinkedListCycleTest {
    private final Solution_141_LinkedListCycle solver = new Solution_141_LinkedListCycle();

    @Test
    void bruteForceTest1() {
        ListNode<Integer> node1 = new ListNode<>(3);
        ListNode<Integer> node2 = new ListNode<>(3);
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node4 = new ListNode<>(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Assertions.assertTrue(solver.hasCycleBruteForce(node1));
    }

    @Test
    void bruteForceTest2() {
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);

        node1.next = node2;
        node2.next = node1;

        Assertions.assertTrue(solver.hasCycleBruteForce(node1));
    }

    @Test
    void bruteForceTest3() {
        ListNode<Integer> node1 = new ListNode<>(1);

        Assertions.assertFalse(solver.hasCycleBruteForce(node1));
    }

    @Test
    void bruteForceTest4() {
        Assertions.assertFalse(solver.hasCycleBruteForce(null));
    }

    @Test
    void test1() {
        ListNode<Integer> node1 = new ListNode<>(3);
        ListNode<Integer> node2 = new ListNode<>(3);
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node4 = new ListNode<>(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Assertions.assertTrue(solver.hasCycle(node1));
    }

    @Test
    void test2() {
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);

        node1.next = node2;
        node2.next = node1;

        Assertions.assertTrue(solver.hasCycle(node1));
    }

    @Test
    void test3() {
        ListNode<Integer> node1 = new ListNode<>(1);

        Assertions.assertFalse(solver.hasCycle(node1));
    }

    @Test
    void test4() {
        Assertions.assertFalse(solver.hasCycle(null));
    }
}
