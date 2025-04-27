package edu.nazarov.tree;

import edu.nazarov.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_101_SymmetricTreeTest {
    private final Solution_101_SymmetricTree solver = new Solution_101_SymmetricTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(4)
                ),
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(3)
                ));

        Assertions.assertTrue(solver.isSymmetric(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null, new TreeNode(3)
                ),
                new TreeNode(2,
                        null, new TreeNode(3)
                ));

        Assertions.assertFalse(solver.isSymmetric(root));
    }
}
