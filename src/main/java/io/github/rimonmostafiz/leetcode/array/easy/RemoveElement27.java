package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 */
public class RemoveElement27 {

    /**
     * Approach: Tow Pointers
     * Time: O(N)
     * Space: O(N)
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
     * Memory Usage: 38.3 MB, less than 50.61% of Java online submissions for Remove Element.
     */
    public int removeElement(int[] nums, int val) {
        int first = 0, last = nums.length - 1;
        while (first < last) {
            if (nums[first] == val && nums[last] != val) {
                int x = nums[last];
                nums[last] = nums[first];
                nums[first] = x;
                last--;
                first++;
            } else if (nums[first] == val && nums[last] == val) {
                last--;
            } else {
                first++;
            }
        }
        int len = 0;
        for (int num : nums) {
            if (num != val) {
                len++;
            } else {
                break;
            }
        }
        return len;
    }
}
