package edu.nazarov.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_490_The_MazeTest {
    private static final Solution_490_The_Maze solution = new Solution_490_The_Maze();

    @Test
    void test() {
        int[][] maze = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };

        int[] start = {0, 4};
        int[] end = {4, 4};

        boolean actual = solution.hasPath(maze, start, end);

        assertTrue(actual);
    }
}