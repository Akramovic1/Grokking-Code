package com.company;


import java.util.*;

public class Main {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1])
                swap(nums,i,nums[i] - 1);
            else
                i++;
        }
        List<Integer> missing = new ArrayList<>();
        for(i = 0; i < nums.length; i++)
            if(nums[i] != i + 1)
                missing.add(i + 1);
        return missing;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] input = new int[]{6,5,6,3,3,2,1};
        List<Integer> output = findDisappearedNumbers(input);
        System.out.println(output);
    }

}



