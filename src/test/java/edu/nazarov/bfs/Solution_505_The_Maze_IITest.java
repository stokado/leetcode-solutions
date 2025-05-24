package edu.nazarov.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_505_The_Maze_IITest {
    private static final Solution_505_The_Maze_II solution = new Solution_505_The_Maze_II();

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

        int actual = solution.shortestDistance(maze, start, end);
        final int expected = 12;

        assertEquals(expected, actual);
    }

}