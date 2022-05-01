package com.company;


import java.util.*;

public class Main {
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums.length && nums[i] != nums[nums[i]])
                swap(nums,i,nums[i]);
            else
                i++;
        }
        i = 0;
        while(i < nums.length){
            if(nums[i] == nums.length)
                return i;
            else
                i++;
        }
        return nums.length;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] input = new int[]{6,5,7,4,3,2,1};
        int output = missingNumber(input);
        System.out.println(output);
    }

}



