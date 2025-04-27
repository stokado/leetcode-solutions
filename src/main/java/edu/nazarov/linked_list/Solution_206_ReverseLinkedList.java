package edu.nazarov.linked_list;

import edu.nazarov.util.ListNode;

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

given:  1 -> 2 -> 3 -> 4
result: 4 -> 3 -> 2 -> 1
 */
public class Solution_206_ReverseLinkedList {
    /*
    Use fake head to iteratively reverse the "next" pointer for each node
    Time: O(n)
    Space: O(1)
     */
    public ListNode<Integer> reverseList(ListNode<Integer> head) {
            ListNode<Integer> newHead = null;

            while (head != null) {
                ListNode<Integer> tmp = head.next;
                head.next = newHead;
                newHead = head;
                head = tmp;
            }

            return newHead;
    }
}
