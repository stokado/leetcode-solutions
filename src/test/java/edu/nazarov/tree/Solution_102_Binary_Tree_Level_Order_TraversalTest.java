package edu.nazarov.tree;

import edu.nazarov.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Solution_102_Binary_Tree_Level_Order_TraversalTest {

    private static final Solution_102_Binary_Tree_Level_Order_Traversal solver = new Solution_102_Binary_Tree_Level_Order_Traversal();

    @Test
    void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)
                )
        );

        var expected = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );
        var actual = solver.levelOrder(root);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);

        var expected = List.of(
                List.of(1)
        );
        var actual = solver.levelOrder(root);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var expected = List.of();
        var actual = solver.levelOrder(null);

        Assertions.assertEquals(expected, actual);
    }

}