package com.company;


import java.util.*;

public class Main {
    public static int[] sort(int[] arr) {
        int i = 0, j;
        while (i < arr.length){
            j = arr[i] - 1;
            if (arr[i] != arr[j])
                swap(arr,i,j);
            else
                i++;
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] input = new int[]{6,5,7,4,3,2,1};
        int[] output = sort(input);
        System.out.println(Arrays.toString(output));
    }

}



