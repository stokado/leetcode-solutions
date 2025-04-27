package edu.nazarov.util;

import java.util.ArrayList;
import java.util.List;

public class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T x) {
        val = x;
        next = null;
    }

    public ListNode(T x, ListNode<T> next) {
        this.val = x;
        this.next = next;
    }

    public static <T> ListNode<T> fromList(List<T> list) {
        if (list == null) {
            return null;
        }

        ListNode<T> head = new ListNode<>(list.get(0));
        ListNode<T> current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode<>(list.get(i));
            current = current.next;
        }
        return head;
    }

    public static <T> List<T> toList(ListNode<T> head) {
        List<T> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }
}
