package io.github.rimonmostafiz.leetcode.array.easy;


/*
    Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
    Note that elements beyond the length of the original array are not written.
    Do the above modifications to the input array in place, do not return anything from your function.

    Example 1:
    Input: [1,0,2,3,0,4,5,0]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

    Example 2:
    Input: [1,2,3]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,2,3]

    Note:
    1 <= arr.length <= 10000
    0 <= arr[i] <= 9
*/

/**
 * @author Rimon Mostafiz
 */
public class DuplicateZeros1089 {

    /**
     * Approach: Two Pass, Two Pointer
     * Time: O(N)
     * Space: O(N)
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Duplicate Zeros.
     * Memory Usage: 40 MB, less than 49.81% of Java online submissions for Duplicate Zeros.
     */
    public void duplicateZeros(int[] arr) {
        int last = arr.length - 1;
        int zeros = 0;
        for (int pos = 0; pos <= last - zeros; pos++) {
            if (arr[pos] == 0) {
                if (pos == last - zeros) {
                    arr[last] = 0;
                    last -= 1;
                    break;
                }
                zeros++;
            }
        }
        int pos = last - zeros;
        for (int i = last; i >= 0; ) {
            if (arr[pos] == 0) {
                arr[i--] = 0;
                arr[i--] = 0;
            } else {
                arr[i--] = arr[pos];
            }
            pos--;
        }
    }

    /**
     * Time: O(N^2)
     * Space: O(N)
     */
    public void duplicateZeros2(int[] arr) {
        int i = 0;
        int N = arr.length;
        while (i < N) {
            if (arr[i] == 0) {
                int p = 0, q = 0;
                for (int j = i + 1; j < N; j++) {
                    q = arr[j];
                    arr[j] = p;
                    p = q;
                }
                i += 2;
            }
            else i++;
        }
    }
}
