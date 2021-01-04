package io.github.rimonmostafiz.leetcode.array.easy;

/*
    Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

    Example 1:
    Input: [-4,-1,0,3,10]
    Output: [0,1,9,16,100]

    Example 2:
    Input: [-7,-3,2,3,11]
    Output: [4,9,9,49,121]

    Note:
    1 <= A.length <= 10000
    -10000 <= A[i] <= 10000
    A is sorted in non-decreasing order.
*/

import java.util.Arrays;

/**
 * @author Rimon Mostafiz
 */
public class SquaresOfASortedArray977 {
     /**
      * Approach: Two Pointer
      * Time: O(N), where N is the length of the array
      * Space: O(N)
      *
      * Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
      * Memory Usage: 41 MB, less than 88.92% of Java online submissions for Squares of a Sorted Array.
     */
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
