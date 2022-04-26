package com.company;

import java.util.Arrays;

public class Main {
    public static int[] dutchNationalFlag(int[] arr){
        int low = 0, high = arr.length - 1, i = 0;
        while (i < high){
            if (arr[i] == 0)    swap(arr, i++, low++);
            else if(arr[i] == 1)    i++;
            else if(arr[i] == 2)    swap(arr, i, high--);
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
	    int[] result = dutchNationalFlag(new int[]{2,0,1});
        System.out.println(Arrays.toString(result));
    }
}
