import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static int findMin(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid > start && arr[mid] < arr[mid - 1])
                return arr[mid];
            if(mid < end && arr[mid] > arr[mid + 1])
                return arr[mid + 1];
            if (arr[start] < arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[0];
    }
    public static void main(String[]args) {
        System.out.println(findMin(new int[]{3,1,2}));
    }
}
