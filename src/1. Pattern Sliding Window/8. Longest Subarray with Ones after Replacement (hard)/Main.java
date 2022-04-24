import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int ReplacingOnes(int[] arr, int k){
       int windowStart = 0;
       int max = 0;
       int maxOnes = 0;
       for (int windowEnd = 0; windowEnd < arr.length; windowEnd++){
           if (arr[windowEnd] == 1) maxOnes++;
           if (windowEnd - windowStart + 1 - maxOnes > k){
               if (arr[windowStart] == 1) maxOnes--;
               windowStart++;
           }
           max = Math.max(max, windowEnd - windowStart + 1);
       }
       return max;
    }
    public static void main(String[]args) {
        int result = ReplacingOnes(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2);
        System.out.println(result);
    }
}
