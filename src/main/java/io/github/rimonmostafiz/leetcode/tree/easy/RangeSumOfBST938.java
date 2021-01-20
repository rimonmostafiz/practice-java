package io.github.rimonmostafiz.leetcode.tree.easy;

/**
 * @author Rimon Mostafiz
 *
 * Problem: 938. Range Sum of BST
 * Link: https://leetcode.com/problems/range-sum-of-bst/
 * Difficulty: Easy
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
 * Memory Usage: 47.4 MB, less than 64.30% of Java online submissions for Range Sum of BST.
 */
public class RangeSumOfBST938 {

    int ans;

    public int rangeSumBST(TreeNode root, int L, int R) {
        return dfs2(root, 0, L, R);
    }

    public void dfs(TreeNode node, int L, int R) {
        if (node == null) return;
        ans += node.val >= L && node.val <= R ? node.val : 0;
        if (L < node.val) dfs(node.left, L, R);
        if (node.val < R) dfs(node.right, L, R);
    }

    public int rangeSumBST2(TreeNode root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
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

    /**
     * Runtime: 1 ms, faster than 55.04% of Java online submissions for Range Sum of BST.
     * Memory Usage: 47.2 MB, less than 81.72% of Java online submissions for Range Sum of BST.
     */
    public int dfs2(TreeNode node, int count, int L, int R) {
        if (node == null) return 0;
        count = dfs2(node.left, count, L, R) + dfs2(node.right, count, L, R);
        return node.val >= L && node.val <= R ? count += node.val : count;
    }
}
