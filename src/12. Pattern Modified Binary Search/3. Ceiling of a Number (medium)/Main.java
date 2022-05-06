import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int searchCeiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if(target > arr[end])
            return -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            if(target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
    public static void main(String[]args) {

    }
}
