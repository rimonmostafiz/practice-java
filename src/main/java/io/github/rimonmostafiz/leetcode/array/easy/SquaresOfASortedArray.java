package io.github.rimonmostafiz.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 977. Squares Of A Sorted Array
 * Link: https://leetcode.com/problems/squares-of-a-sorted-array/
 * Difficulty: Easy
 *
 * Approach: Two Pointer
 * Time: O(N), where N is the length of the array
 * Space: O(N)
 *
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
 * Memory Usage: 41 MB, less than 88.92% of Java online submissions for Squares of a Sorted Array.
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int pa = 0, pb = 0;
        while (pb < len && A[pb] < 0) {
            pb++;
        }
        pa = pb - 1;

        int[] res = new int[len];
        int i = 0;
        while (pa >= 0 && pb < len) {
            if (A[pa] * A[pa] <= A[pb] * A[pb]) {
                res[i++] = A[pa] * A[pa];
                pa--;
            } else {
                res[i++] = A[pb] * A[pb];
                pb++;
            }
        }
        while (pa >= 0) {
            res[i++] = A[pa] * A[pa];
            pa--;
        }
        while (pb < len) {
            res[i++] = A[pb] * A[pb];
            pb++;
        }
        return res;
    }

    /**
     * Time: O(N longN)
     * Space: O(N)
     */
    public int[] sortedSquares2(int[] A) {
        int len = A.length;
        for(int i = 0; i < len; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
