import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static int search(int[] arr, int key){
        int max = findMax(arr);
        int keyIndex = -1;
        keyIndex = binarySearch(arr, key, 0, max, true);
        if (keyIndex != -1)
            return keyIndex;
        return binarySearch(arr, key, max + 1, arr.length - 1, false);
    }

    public static int binarySearch(int[] arr, int key, int start, int end, boolean ascending){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid])
                return mid;
            if (ascending) {
                if (key < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (key > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
    public static int findMax(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    public static void main(String[]args) {
        System.out.println(search(new int[]{1,3,8,12,4,2}, 2));
    }
}
