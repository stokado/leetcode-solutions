package edu.nazarov.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_207_Course_ScheduleTest {
    private static final Solution_207_Course_Schedule solution = new Solution_207_Course_Schedule();

    @Test
    void test1() {
        int numCourses = 2;
        int[][] prerequisites = new int[][] {
                {1, 0}
        };

        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void test2() {
        int numCourses = 5;
        int[][] prerequisites = new int[][] {
                {0, 1},
                {0, 2},
                {1, 3},
                {1, 4},
                {3, 4},
        };

        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void test3() {
        int numCourses = 2;
        int[][] prerequisites = new int[][] {
                {0, 1},
                {1, 0},
        };

        assertFalse(solution.canFinish(numCourses, prerequisites));
    }
}