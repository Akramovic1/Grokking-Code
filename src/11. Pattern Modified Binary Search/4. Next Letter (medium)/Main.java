import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0, end = arr.length - 1;
        if(target < arr[0] || target > arr[end])
            return arr[0];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start%arr.length];
    }
    public static void main(String[]args) {

    }
}
