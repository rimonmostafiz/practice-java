package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 26. Remove Duplicates from Sorted Array
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty: Easy
 *
 * Approach: Two Pointers
 * Time: O(N)
 * Space: O(N)
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
 * Memory Usage: 41.5 MB, less than 57.67% of Java online submissions for Remove Duplicates from Sorted Array.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int el = 0, c = 0;
        int pf = el + 1;
        while (c < nums.length) {
            if (nums[el] == nums[c]) c++;
            else if (nums[el] != nums[c]) {
                nums[pf++] = nums[c];
                el = c;
                c++;
            }
        }
        return pf;
    }
}
