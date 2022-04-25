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
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            tmp = target - arr[i];
            if(indexMap.containsKey(tmp)){
                return new int[]{indexMap.get(tmp), i};
            }
            indexMap.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[]args) {
        int[] result = twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
    }
}
