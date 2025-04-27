package edu.nazarov.tree;

import edu.nazarov.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_100_SameTreeTest {
    private final Solution_100_SameTree solver = new Solution_100_SameTree();

    @Test
    void test1() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2), new TreeNode(3)
        );
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2), new TreeNode(3)
        );

        Assertions.assertTrue(solver.isSameTree(root1, root2));
    }

    @Test
    void test2() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2), null
        );
        TreeNode root2 = new TreeNode(1,
                null, new TreeNode(2)
        );

        Assertions.assertFalse(solver.isSameTree(root1, root2));
    }

    @Test
    void test3() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2), new TreeNode(3)
        );
        TreeNode root2 = new TreeNode(1,
                new TreeNode(3), new TreeNode(2)
        );

        Assertions.assertFalse(solver.isSameTree(root1, root2));
    }
}
