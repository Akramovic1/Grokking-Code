import java.util.*;

public class Main {
    public static int[] PairWithTargetSum (int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;
        while(left < right){
            sum = arr[left] + arr[right];
            if(sum == target)   return new int[]{left,right};
            if(sum < target) left++; else right--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[]args) {
        int[] result = PairWithTargetSum(new int[]{1,2,3,4,6}, 6);
        System.out.println(Arrays.toString(result));
    }
}
