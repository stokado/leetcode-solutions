package edu.nazarov.linked_list;

import edu.nazarov.util.ListNode;

import java.util.HashMap;
import java.util.Map;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class Solution_141_LinkedListCycle {
    /*
    Brute force solution
    Cycle through list, store all nodes in HashMap
    If any node is present in HashMap, then it has cycle

    time: O(n)
    space: O(n)
     */
    public boolean hasCycleBruteForce(ListNode<Integer> head) {
        Map<ListNode<Integer>, Integer> visited = new HashMap<>();
        ListNode<Integer> current = head;

        while (current != null) {
            if (visited.containsKey(current)) {
                return true;
            } else {
                visited.put(current, current.val);
            }
            current = current.next;
        }
        return false;
    }

    /*
    Use fast and slow pointers
    time: O(n)
    space: O(1)
     */
    public boolean hasCycle(ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
