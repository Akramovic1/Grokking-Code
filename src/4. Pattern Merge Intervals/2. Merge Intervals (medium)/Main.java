package com.company;


import java.util.*;

public class Main {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals;
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        List<Interval> output = new ArrayList<>();
        Iterator it = intervals.iterator();
        Interval interval = (Interval) it.next();
        int start = interval.start;
        int end = interval.end;
        while (it.hasNext()){
            interval = (Interval) it.next();
            if (interval.start <= end) end = Math.max(end, interval.end);
            else {
                output.add(new Interval(start,end));
                start = interval.start;
                end = interval.end;
            }
        }
        output.add(new Interval(interval.start,interval.end));
        return output;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print(merge(input));

    }
}
