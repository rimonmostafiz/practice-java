package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 88. Merge Sorted Array
 * Link: https://leetcode.com/problems/merge-sorted-array/
 * Difficulty: Easy
 *
 * Approach: Two Pointers
 * Time: O(N)
 * Space: O(N)
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 39.4 MB, less than 81.78% of Java online submissions for Merge Sorted Array.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1 -= 1;
            } else {
                nums1[i] = nums2[p2];
                p2 -= 1;
            }
            i--;
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
