package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 1480. Running Sum Of 1d Array
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/
 * Difficulty: Easy
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
 * Memory Usage: 39.5 MB, less than 81.72% of Java online submissions for Running Sum of 1d Array.
 */
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
