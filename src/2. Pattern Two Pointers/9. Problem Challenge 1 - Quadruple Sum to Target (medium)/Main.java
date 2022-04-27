package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<List<Integer>> fourSum(int[] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> quadruplets = new ArrayList<>();
        int left, sum;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length - 3; i++){
            if (i > 0 && arr[i] == arr[i - 1])  continue;
            for (int j = 0; j < arr.length - 2; j++){
                if (j > i + 1 && arr[j] == arr[j - 1])  continue;
                left = j + 1;right = arr.length - 1;
                while (left < right){
                    sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (target == sum){
                        quadruplets.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;
                        while (left < right && arr[left] == arr[left - 1])   left++;
                        while (left < right && arr[right] == arr[right + 1])    right--;
                    } else if(sum > target) right--;
                    else left++;
                }
            }
        }
        return quadruplets;
    }

    public static void main(String[] args) {
	    List<List<Integer>> result = fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        System.out.println(result);
    }
}
