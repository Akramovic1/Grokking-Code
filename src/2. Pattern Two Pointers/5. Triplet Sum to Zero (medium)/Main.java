import java.util.*;

public class Main {
    public static List<List<Integer>> tripletSumToZero (int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> triplet = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            searchPairs(arr, -arr[i], i + 1, triplet, arr.length - 1);
        }
        return triplet;
    }
    public static void searchPairs (int[] arr, int target,int left, List<List<Integer>> triplet, int right){
        int sum;
        while (left < right){
            sum = arr[left] + arr[right];
            if (sum == target){
                triplet.add(Arrays.asList(-target,arr[left],arr[right]));
                right--;left++;
                while (left < right && arr[left] == arr[left - 1])     left++;
                while (left < right && arr[right] == arr[right - 1])    right--;
            } else if (sum < target)    left++;
            else right--;
        }
    }
    public static void main(String[]args) {
        List<List<Integer>> result = tripletSumToZero(new int[]{-3,0,1,2,-1,1,-2});
        System.out.println(result);
    }
}
