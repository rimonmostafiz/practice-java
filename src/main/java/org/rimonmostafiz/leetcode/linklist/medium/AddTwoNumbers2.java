package org.rimonmostafiz.leetcode.linklist.medium;

/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example:
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
 */

/**
 * @author Rimon Mostafiz
 *
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
 * Memory Usage: 39.6 MB, less than 75.33% of Java online submissions for Add Two Numbers.
 */

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode ret = res;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            res.next = new ListNode((a + b + carry) % 10);
            res = res.next;
            carry = ((a + b + carry) / 10);
        }
        if (carry != 0) res.next = new ListNode(carry);
        return ret.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
