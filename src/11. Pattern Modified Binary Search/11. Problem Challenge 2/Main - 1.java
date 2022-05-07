import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            if(arr[start] <= arr[mid]){
                if(target <= arr[mid] && target >= arr[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if(target >= arr[mid] && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[]args) {
    }
}
