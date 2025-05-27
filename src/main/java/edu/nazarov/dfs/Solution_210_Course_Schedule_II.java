package edu.nazarov.dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_210_Course_Schedule_II {
    private final List<List<Integer>> preList = new ArrayList<>();
    private final Set<Integer> visiting = new HashSet<>();
    private final Set<Integer> visited = new HashSet<>();
    private final List<Integer> result = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            preList.add(i, new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            preList.get(prerequisite[0]).add(prerequisite[1]);
        }


        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course)) {
                return new int[]{};
            }
        }

        return result.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    private boolean dfs(int course) {
        if (visiting.contains(course)) {
            return false;
        }

        if (visited.contains(course)) {
            return true;
        }

        visiting.add(course);

        for (int pre : preList.get(course)) {
            if (!dfs(pre)) {
                return false;
            }
        }
        visiting.remove(course);

        visited.add(course);

        result.add(course);

        return true;
    }
}
