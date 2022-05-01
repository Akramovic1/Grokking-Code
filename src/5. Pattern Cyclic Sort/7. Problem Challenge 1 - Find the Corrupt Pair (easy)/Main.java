package com.company;


import java.util.*;

public class Main {
    public static int[] findCorrupt(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1])
                swap(nums,i,nums[i]-1);
            else
                i++;
        }
        for(i = 0; i < nums.length; i++)
            if(nums[i] != i + 1) return new int[]{nums[i],i+1};

        return new int[]{};
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,4,6};
        int[] output = findCorrupt(input);
        System.out.println(Arrays.toString(output));
    }

}



