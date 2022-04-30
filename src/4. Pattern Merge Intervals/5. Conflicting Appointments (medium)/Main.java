package com.company;


import java.util.*;

public class Main {
    public static boolean canAttendAllAppointments(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.start));
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i].start < intervals[i-1].end) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Interval[] intervals = { new Interval(1, 4), new Interval(2, 5), new Interval(7, 9) };
        boolean result = canAttendAllAppointments(intervals);
        System.out.println("Can attend all appointments: " + result);
        Interval[] intervals1 = { new Interval(6, 7), new Interval(2, 4), new Interval(8, 12) };
        result = canAttendAllAppointments(intervals1);
        System.out.println("Can attend all appointments: " + result);
        Interval[] intervals2 = { new Interval(4, 5), new Interval(2, 3), new Interval(3, 6) };
        result = canAttendAllAppointments(intervals2);
        System.out.println("Can attend all appointments: " + result);
        int[] arr = new int[]{1,2,3,4,5,6};

    }
}
class Interval {
    int start;
    int end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
};

