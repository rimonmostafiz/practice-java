package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 1470. Shuffel The Array
 * Link: https://leetcode.com/problems/shuffle-the-array/
 * Difficulty: Easy
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
 * Memory Usage: 39.6 MB, less than 76.29% of Java online submissions for Shuffle the Array.
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int k = 0;
        for (int i = 0, j = n; j < nums.length; i++, j++) {
            res[k++] = nums[i];
            res[k++] = nums[j];
        }
        return res;
    }
}
