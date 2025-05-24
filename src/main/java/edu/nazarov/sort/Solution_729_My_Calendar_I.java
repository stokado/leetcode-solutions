package edu.nazarov.sort;

import java.util.TreeMap;

public class Solution_729_My_Calendar_I {
    public static class MyCalendar {
        private final TreeMap<Integer, Integer> calendar;

        public MyCalendar() {
            calendar = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            var previous = calendar.floorEntry(start);
            var next = calendar.ceilingEntry(start);

            if ((previous == null || previous.getValue() <= start)
                    && (next == null || end <= next.getKey())
            ) {
               calendar.put(start, end);
               return true;
            }

            return false;
        }
    }
}
