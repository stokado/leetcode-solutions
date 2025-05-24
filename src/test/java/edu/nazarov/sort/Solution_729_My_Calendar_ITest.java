package edu.nazarov.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Solution_729_My_Calendar_ITest {
    private Solution_729_My_Calendar_I.MyCalendar calendar = new Solution_729_My_Calendar_I.MyCalendar();

    @AfterEach
    void reset() {
        calendar = new Solution_729_My_Calendar_I.MyCalendar();
    }

    @Test
    void test1() {
        assertTrue(calendar.book(10, 20));
        assertFalse(calendar.book(15, 25));
        assertTrue(calendar.book(20, 30));
    }

    @Test
    void test2() {
        assertTrue(calendar.book(47, 50));
        assertTrue(calendar.book(33, 41));
        assertFalse(calendar.book(39, 45));
        assertFalse(calendar.book(33, 42));
        assertTrue(calendar.book(25, 32));
        assertFalse(calendar.book(26, 35));
        assertTrue(calendar.book(19, 25));
        assertTrue(calendar.book(3, 8));
        assertTrue(calendar.book(8, 13));
        assertFalse(calendar.book(18, 27));
    }

}