package com.company;


import java.util.*;

public class Main {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> output = new ArrayList<>();
        int i = 0, j = 0;
        while((i < firstList.length) && (j < secondList.length)){
            if(((firstList[i][0] >= secondList[j][0]) && (firstList[i][0] <= secondList[j][1])) || ((secondList[j][0] >= firstList[i][0]) && (secondList[j][0] <= firstList[i][1])) ) {
                int start = Math.max(firstList[i][0],secondList[j][0]);
                int end = Math.min(firstList[i][1],secondList[j][1]);
                if(start <= end)
                    output.add(new int[]{start, end});
            }
            if(firstList[i][1] < secondList[j][1])
                i++;
            else
                j++;
        }
        return output.toArray(new int[output.size()][]);
    }

    public static void main(String[] args) {
        int[][] result = intervalIntersection(new int[][]{{14,16}},new int[][]{{7,13},{16,20}});
        for (int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
