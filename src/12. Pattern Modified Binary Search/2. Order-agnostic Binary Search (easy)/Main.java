import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAscending;
        if(arr[start] <= arr[end])
            isAscending = true;
        else
            isAscending = false;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            if(isAscending){
                if(target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if(target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[]args) {

    }
}
