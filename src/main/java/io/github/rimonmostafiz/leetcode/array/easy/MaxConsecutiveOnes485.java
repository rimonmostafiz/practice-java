package io.github.rimonmostafiz.leetcode.array.easy;

/*
    Given a binary array, find the maximum number of consecutive 1s in this array.

    Example 1:
    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.

    Note:
    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000
*/

/**
 * @author Rimon Mostafiz
 */
public class MaxConsecutiveOnes485 {

    /**
     * Runtime: 2 ms, faster than 73.89% of Java online submissions for Max Consecutive Ones.
     * Memory Usage: 41.1 MB, less than 75.83% of Java online submissions for Max Consecutive Ones.
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx = 0, c = 0;
        for (int i : nums) {
            c = i == 1 ? c + 1 : 0;
            mx = Math.max(c, mx);
        }
        return mx;
    }
}
