
public class Main {
    public static int maximumSumSubArrayOfSizeK(int k, int[] arr){
      int windowSum = 0;
      int windowStart = 0;
      int max = Integer.MIN_VALUE;
      for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
          windowSum += arr[windowEnd];
          if(windowEnd >= k - 1){
              max = Math.max(max, windowSum);
              windowSum -= arr[windowStart];
              windowStart++;
          }
      }
      return max;
    }
    public static void main(String[]args) {
        int result = maximumSumSubArrayOfSizeK(3,new int[] {2,1,5,1,3,2});
        System.out.println(result);
    }
}
