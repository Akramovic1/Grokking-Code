import java.util.*;

public class Main {
    public static int removeDuplicates (int[] arr){
        int left = 1, right = 1;
        while (right < arr.length){
            if (arr[left - 1] != arr[right]){
                arr[left] = arr[right];
                left++;
            }
            right++;
        }
        return left;
    }
    public static void main(String[]args) {
        int result = removeDuplicates(new int[]{2,3,3,3,6,9,9});
        System.out.println(result);
    }
}
