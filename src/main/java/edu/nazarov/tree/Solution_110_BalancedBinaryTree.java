package edu.nazarov.tree;

import edu.nazarov.util.TreeNode;

public class Solution_110_BalancedBinaryTree {
    private boolean result = true;

    public void reset() {
        this.result = true;
    }

    public boolean isBalanced(TreeNode root) {
        depthDfs(root);
        return result;
    }

    private int depthDfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = depthDfs(root.left);
        int rightDepth = depthDfs(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            result = false;
        }

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
