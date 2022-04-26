package com.company;

import java.util.Arrays;

public class Main {
    public static int tripletWithSmallerSum(int[] arr, int targetSum){
        Arrays.sort(arr);
        int count = 0;
        int left;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length - 2; i++){
            left = i + 1;
            while (left < right){
                if (arr[left] + arr[right] < targetSum - arr[i]){
                    count += right - left;
                    left++;
                } else  right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
	    int result = tripletWithSmallerSum(new int[]{-1, 0, 2, 3},3);
        System.out.println(result);
    }
}
