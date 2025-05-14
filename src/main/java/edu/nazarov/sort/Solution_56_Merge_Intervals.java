package edu.nazarov.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution_56_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        // sort by interval start
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) { // overlapping intervals, move end if needed
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else { // new interval, add it to the list
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
