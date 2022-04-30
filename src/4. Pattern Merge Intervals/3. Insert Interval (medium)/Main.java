package com.company;


import java.util.*;

public class Main {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> output = new ArrayList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]) output.add(intervals[i++]);
        while (i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        output.add(newInterval);
        while (i < intervals.length) output.add(intervals[i++]);
        return output.toArray(new int[output.size()][]);
    }

    public static void main(String[] args) {
        int[][] result = insert(new int[][]{{1,3}, {6, 9}},new int[]{2,5});
        for (int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
