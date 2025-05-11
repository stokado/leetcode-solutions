package edu.nazarov.dfs;

import edu.nazarov.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YaDeepestElementSolutionTest {
    private static final YaDeepestElementSolution solution = new YaDeepestElementSolution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), null
                        ), null
                ), new TreeNode(2)
        );

        var actual = solution.deepestElement(root);

        Assertions.assertEquals(4, actual.val);
    }
}