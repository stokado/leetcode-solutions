package edu.nazarov.dfs;

import edu.nazarov.util.TreeNode;

/*
Дано бинарное дерево, нужно найти и вернуть элемент, находящийся на максимальной глубине от корня.
 */
public class YaDeepestElementSolution {
    private int maxDepth = 0;
    private TreeNode deepestNode = null;

    public TreeNode deepestElement(TreeNode root) {
        if (root == null) {
            return deepestNode;
        }

        dfsRecursion(root, 0);

        return deepestNode;
    }

    private void dfsRecursion(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        if (depth > maxDepth) {
            maxDepth = depth;
            deepestNode = node;
        }

        dfsRecursion(node.left, depth + 1);
        dfsRecursion(node.right, depth + 1);
    }
}
