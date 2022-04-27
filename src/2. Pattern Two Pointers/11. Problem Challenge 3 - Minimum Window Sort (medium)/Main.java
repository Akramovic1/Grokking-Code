package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int findUnsortedSubarray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < arr.length - 1 && arr[low] <= arr[low + 1])   low++;
        if (low == arr.length - 1) return 0;
        while (high > 0 && arr[high] >= arr[high - 1])  high--;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = low; i <= high; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        while (arr[low - 1] > min)  low--;
        while (arr[high + 1] < max) high++;
        return high - low + 1;
    }

    public static void main(String[] args) {
	    int result = findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
        System.out.println(result);
    }
}
