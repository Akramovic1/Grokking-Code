import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static int findMin(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]) return arr[start + 1];
                start++;
                if(arr[end-1] > arr[end])   return arr[end];
                end--;
            }
            if(mid > start && arr[mid] < arr[mid - 1])
                return arr[mid];
            if(mid < end && arr[mid] > arr[mid + 1])
                return arr[mid + 1];
            if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[0];
    }
    public static void main(String[]args) {

    }
}
