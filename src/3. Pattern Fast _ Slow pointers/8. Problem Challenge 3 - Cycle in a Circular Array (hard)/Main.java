package com.company;



public class Main {
    public boolean circularArrayLoop(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            boolean isForward = arr[i] >= 0;
            int slow = i, fast = i;
            do{
                slow = updateIndex(arr, isForward, slow);
                fast = updateIndex(arr, isForward, fast);
                if(fast != -1)  fast = updateIndex(arr, isForward, fast);
                if(slow != -1 && slow == fast)    return true;
            }while(slow != -1 && fast != -1);
        }
        return false;
    }
    public int updateIndex(int[] arr, boolean isForward, int index){
        if((arr[index] >= 0) != isForward)  return -1;
        int newIndex = (index + arr[index]) % arr.length;
        if(newIndex < 0) newIndex += arr.length;
        if(newIndex == index)   return -1;
        return newIndex;
    }

    public static void main(String[] args) {
    }
}
