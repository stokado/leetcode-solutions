package edu.nazarov.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_207_Course_Schedule {
    private final List<List<Integer>> preList = new ArrayList<>();
    private final Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            preList.add(i, new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            preList.get(prerequisite[0]).add(prerequisite[1]);
        }

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course) {
        if (visiting.contains(course)) {
            return false;
        }

        if (preList.get(course).isEmpty()) {
            return true;
        }

        visiting.add(course);
        for (int pre : preList.get(course)) {
            if (!dfs(pre)) {
                return false;
            }
        }
        visiting.remove(course);

        preList.set(course, Collections.emptyList());

        return true;
    }
}
