import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        result[0] = search(nums, target, true);
        if(result[0] != -1)
            result[1] = search(nums, target, false);
        return result;
    }
    private int search(int[] arr, int target, boolean flag){
        int start = 0, end = arr.length - 1, index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                index = mid;
                if(flag)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if(target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return index;
    }
    public static void main(String[]args) {

    }
}
