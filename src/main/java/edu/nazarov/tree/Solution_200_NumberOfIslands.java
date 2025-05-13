package edu.nazarov.tree;

import java.util.Deque;
import java.util.LinkedList;

public class Solution_200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1' && grid[r][c] != '0') {
                    islands++;
                    grid[r][c] = '0';

                    // BFS
                    Deque<int[]> queue = new LinkedList<>();

                    queue.offer(new int[]{r, c});

                    while (!queue.isEmpty()) {
                        int[] currentPos = queue.poll();

                        for (Direction direction : Direction.values()) {
                            int nextRow = currentPos[0] + direction.dx;
                            int nextCol = currentPos[1] + direction.dy;

                            if (nextRow >= 0 && nextRow < rows &&
                                    nextCol >= 0 && nextCol < cols &&
                                    grid[nextRow][nextCol] == '1') {
                                queue.offer(new int[]{nextRow, nextCol});
                                grid[nextRow][nextCol] = '0';
                            }
                        }
                    }

                }
            }
        }

        return islands;
    }

    private enum Direction {
        UP(0, 1),
        DOWN(0, -1),
        LEFT(-1, 0),
        RIGHT(1, 0);

        Direction(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }

        final int dx;
        final int dy;
    }
}
