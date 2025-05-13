package edu.nazarov.tree;

import edu.nazarov.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; ++i) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }
}
