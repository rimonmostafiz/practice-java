package io.github.rimonmostafiz.leetcode.tree.easy;

/*
    Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
    The binary search tree is guaranteed to have unique values.

    Example 1:
    Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
    Output: 32

    Example 2:
    Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
    Output: 23

    Note:
    The number of nodes in the tree is at most 10000.
    The final answer is guaranteed to be less than 2^31.
*/

/**
 * @author Rimon Mostafiz
 */
public class RangeSumOfBST938 {

    /**
     * Runtime: 1 ms, faster than 55.04% of Java online submissions for Range Sum of BST.
     * Memory Usage: 47.2 MB, less than 81.72% of Java online submissions for Range Sum of BST.
     */
    public int dfs(TreeNode node, int count, int L, int R) {
        if (node == null) return 0;
        count = dfs(node.left, count, L, R) + dfs(node.right, count, L, R);
        return node.val >= L && node.val <= R ? count += node.val : count;
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        return dfs(root, 0, L, R);
    }


    int ans;

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
     * Memory Usage: 47.4 MB, less than 64.30% of Java online submissions for Range Sum of BST.
     */
    public void dfs2(TreeNode node, int L, int R) {
        if (node == null) return;
        ans += node.val >= L && node.val <= R ? node.val : 0;
        if (L < node.val) dfs2(node.left, L, R);
        if (node.val < R) dfs2(node.right, L, R);
    }

    public int rangeSumBST2(TreeNode root, int L, int R) {
        ans = 0;
        dfs2(root, L, R);
        return ans;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
