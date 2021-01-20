package io.github.rimonmostafiz.leetcode.linklist.medium;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 19. Remove Nth Node From End of List
 * Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Difficulty: Medium
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
 * Memory Usage: 37.5 MB, less than 88.43% of Java online submissions for Remove Nth Node From End of List.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode first = head, last = head;
        while (n-- > 0) last = last.next;
        if (last == null) return head.next;
        while (last.next != null) {
            first = first.next;
            last = last.next;
        }
        first.next = first.next.next;
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
