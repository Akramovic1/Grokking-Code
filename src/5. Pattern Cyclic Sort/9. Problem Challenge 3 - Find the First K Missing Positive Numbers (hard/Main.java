package com.company;


import java.util.*;

public class Main {
    public static List<Integer> findNumber(int[] nums, int k) {
        int i = 0;
        while(i < nums.length) {
            if (nums[i] > 0 && nums[i] < nums.length + 1 && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }
        List<Integer> missing = new ArrayList<>();
        Set<Integer> extra = new HashSet<>();
        for(i = 0; i < nums.length && missing.size() < k; i++){
            if (nums[i] != i + 1){
                missing.add(i+1);
                extra.add(nums[i]);
            }
        }
        for (i = 1; missing.size() < k; i++){
            int candidate = nums.length + i;
            if(!extra.contains(candidate)) missing.add(candidate);
        }
        return missing;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,3,4,4,5,6};
        List<Integer> output = findNumber(input,2);
        System.out.println(output);
    }

}



