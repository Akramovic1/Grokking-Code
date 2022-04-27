package com.company;

import java.util.Arrays;

public class Main {
    public static int tripletSumCloseToTarget(int[] arr, int targetSum){
        Arrays.sort(arr);
        int diff, left,right;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 2; i++){
            if (i > 0 && arr[i] == arr[i-1])    continue;
            left = i + 1; right = arr.length - 1;
            while (left < right){
                diff = targetSum - arr[i] - arr[left] - arr[right];
                if (diff == 0)   return targetSum;
                if (Math.abs(diff) < Math.abs(min)) min = diff;
                if (diff > 0)   left++; else right--;
            }
        }
        return targetSum - min;
    }

    public static void main(String[] args) {
	    int result = tripletSumCloseToTarget(new int[]{-2, 0, 1, 2},2);
        System.out.println(result);
    }
}
