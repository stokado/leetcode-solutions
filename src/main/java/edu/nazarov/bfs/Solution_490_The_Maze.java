package edu.nazarov.bfs;

import edu.nazarov.util.Direction;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_490_The_Maze {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int n = maze.length;
        int m = maze[0].length;

        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(start);
        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (curr[0] == destination[0] && curr[1] == destination[1]) {
                return true;
            }

            for (Direction direction : Direction.values()) {
                int x = curr[0];
                int y = curr[1];

                while (x >= 0 && x < n && y >= 0 && y < m && maze[x][y] == 0) {
                    x += direction.dx;
                    y += direction.dy;
                }

                x -= direction.dx;
                y -= direction.dy;

                if (!visited[x][y]) {
                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }

        return false;
    }
}
