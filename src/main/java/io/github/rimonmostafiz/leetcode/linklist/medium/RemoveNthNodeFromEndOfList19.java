package io.github.rimonmostafiz.leetcode.linklist.medium;

/*
    Given a linked list, remove the n-th node from the end of list and return its head.
    Example:
    Given linked list: 1->2->3->4->5, and n = 2.
    After removing the second node from the end, the linked list becomes 1->2->3->5.

    Note:
    Given n will always be valid.
    Follow up:
    Could you do this in one pass?
*/

/**
 * @author Rimon Mostafiz
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
 * Memory Usage: 37.5 MB, less than 88.43% of Java online submissions for Remove Nth Node From End of List.
 */
public class RemoveNthNodeFromEndOfList19 {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
     * Memory Usage: 37.5 MB, less than 88.43% of Java online submissions for Remove Nth Node From End of List.
     */
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
