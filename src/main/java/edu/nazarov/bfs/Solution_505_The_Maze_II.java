package edu.nazarov.bfs;

import edu.nazarov.util.Direction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_505_The_Maze_II {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int n = maze.length;
        int m = maze[0].length;

        int[][] distances = new int[n][m];
        for (int[] row : distances) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        distances[start[0]][start[1]] = 0;

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(start);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (Direction dir : Direction.values()) {
                int x = cur[0] + dir.dx;
                int y = cur[1] + dir.dy;

                int count = 0;

                while (x >= 0 && y >= 0 && x < n && y < m && maze[x][y] == 0) {
                    x += dir.dx;
                    y += dir.dy;
                    count++;
                }

                x -= dir.dx;
                y -= dir.dy;

                int distance = distances[cur[0]][cur[1]] + count;

                if (distance < distances[x][y]) {
                    distances[x][y] = distance;
                    queue.offer(new int[]{x, y});
                }
            }
        }

        int result = distances[destination[0]][destination[1]];
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
