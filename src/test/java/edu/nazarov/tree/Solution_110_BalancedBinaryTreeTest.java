package edu.nazarov.tree;

import edu.nazarov.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_110_BalancedBinaryTreeTest {
    private static final Solution_110_BalancedBinaryTree solver = new Solution_110_BalancedBinaryTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)
                )
        );

        Assertions.assertTrue(solver.isBalanced(root));
        solver.reset();
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), new TreeNode(4)
                        ), new TreeNode(3)
                ),
                new TreeNode(2)
        );

        Assertions.assertFalse(solver.isBalanced(root));
        solver.reset();
    }

    @Test
    void test3() {
        Assertions.assertTrue(solver.isBalanced(null));
        solver.reset();
    }
}
