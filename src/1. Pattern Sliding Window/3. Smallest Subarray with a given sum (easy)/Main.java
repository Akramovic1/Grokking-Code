
public class Main {
    public static int SmallestSubArrayWithAGivenSum(int s, int[] arr){
      int min  = Integer.MAX_VALUE;
      int windowSum = 0;
      int windowStart = 0;
      for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
          windowSum += arr[windowEnd];
          while(windowSum >= s){
              min = Math.min(min, windowEnd - windowStart + 1);
              windowSum -= arr[windowStart];
              windowStart++;
          }
      }
      return min;
    }
    public static void main(String[]args) {
        int result = SmallestSubArrayWithAGivenSum(7,new int[] {2,1,5,2,3,2});
        System.out.println(result);
    }
}
