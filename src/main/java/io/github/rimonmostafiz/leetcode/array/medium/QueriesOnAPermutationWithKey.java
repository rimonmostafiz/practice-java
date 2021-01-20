package io.github.rimonmostafiz.leetcode.array.medium;

import java.util.LinkedList;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 1409. Queries on a Permutation With Key
 * Link: https://leetcode.com/problems/queries-on-a-permutation-with-key/
 * Difficulty: Medium
 *
 * Approch: Brute Force with Linked List
 * Time: O(N^2)
 * Space: O(N)
 *
 * Runtime: 13 ms, faster than 35.40% of Java online submissions for Queries on a Permutation With Key.
 * Memory Usage: 39.1 MB, less than 73.80% of Java online submissions for Queries on a Permutation With Key.
 *
 * Note: There exists an O(N Log N) Solution with Binary Index Tree (Fenwick Tree)
 */
public class QueriesOnAPermutationWithKey {

    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            linkedList.add(i);
        }
        int[] resultArray = new int[queries.length];
        int resultIdx = 0;

        for (int itemToFind : queries) {
            int index = 0;
            for (Integer item : linkedList) {
                if (item == itemToFind) {
                    linkedList.remove(index);
                    linkedList.addFirst(itemToFind);
                    resultArray[resultIdx++] = index;
                    break;
                } else {
                    index++;
                }
            }
        }
        return resultArray;
    }
}
