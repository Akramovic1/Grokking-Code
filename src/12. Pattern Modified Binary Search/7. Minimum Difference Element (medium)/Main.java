import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int MinimumDifferenceElement(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target < arr[start])
            return arr[start];
        else if (target > arr[end])
            return arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return arr[mid];
            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        if ((arr[start] - target) < (target - arr[end]))
            return arr[start];
        else
            return arr[end];
    }
    public static void main(String[]args) {

    }
}
