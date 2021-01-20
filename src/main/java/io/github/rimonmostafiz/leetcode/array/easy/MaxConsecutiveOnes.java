package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 485. Max Consecutive Ones
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 * Difficulty: Easy
 *
 * Runtime: 2 ms, faster than 73.89% of Java online submissions for Max Consecutive Ones.
 * Memory Usage: 41.1 MB, less than 75.83% of Java online submissions for Max Consecutive Ones.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx = 0, c = 0;
        for (int i : nums) {
            c = i == 1 ? c + 1 : 0;
            mx = Math.max(c, mx);
        }
        return mx;
    }
}
