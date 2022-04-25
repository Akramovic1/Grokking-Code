import java.util.*;

public class Main {
    public static int[] squaringASortedArray (int[] arr){
        int left = 0, right = arr.length - 1;
        int highestIndex = arr.length - 1;
        int[] squaredArray = new int[arr.length];
        while (left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(rightSquare >= leftSquare) {
                squaredArray[highestIndex--] = rightSquare;
                right--;
            } else {
                squaredArray[highestIndex--] = leftSquare;
                left++;
            }
        }
        return squaredArray;
    }
    public static void main(String[]args) {
        int[] result = squaringASortedArray(new int[]{-2,-1,0,2,3});
        System.out.println(Arrays.toString(result));
    }
}
