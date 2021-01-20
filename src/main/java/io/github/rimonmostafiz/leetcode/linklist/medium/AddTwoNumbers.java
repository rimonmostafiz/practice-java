package io.github.rimonmostafiz.leetcode.linklist.medium;
/**
 * @author Rimon Mostafiz
 *
 * Problem: 2. Add Two Numbers
 * Link: https://leetcode.com/problems/add-two-numbers/
 * Difficulty: Medium
 *
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
 * Memory Usage: 39.6 MB, less than 75.33% of Java online submissions for Add Two Numbers.
 */

public class AddTwoNumbers {
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
