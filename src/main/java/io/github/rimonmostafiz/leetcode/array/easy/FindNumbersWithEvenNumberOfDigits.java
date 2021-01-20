package io.github.rimonmostafiz.leetcode.array.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 1295. Find Numbers with Even Number of Digits
 * Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Difficulty: Easy
 *
 * Runtime: 1 ms, faster than 96.89% of Java online submissions for Find Numbers with Even Number of Digits.
 * Memory Usage: 39.2 MB, less than 67.42% of Java online submissions for Find Numbers with Even Number of Digits.
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            even += str.length() % 2 == 0 ? 1 : 0;
        }
        return even;
    }
}
