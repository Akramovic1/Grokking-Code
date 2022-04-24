import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int FruitsIntoBaskets(char[] arr){
      int max  = Integer.MIN_VALUE;
      int windowStart = 0;
      Map<Character, Integer> windowFreq = new HashMap<>();
      for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
          windowFreq.put(arr[windowEnd],windowFreq.getOrDefault(windowFreq.get(arr[windowEnd]),0) + 1);
          while(windowFreq.size() > 2){
              windowFreq.put(arr[windowStart],windowFreq.get(arr[windowStart]) - 1);
              if(windowFreq.get(arr[windowStart]) == 0) windowFreq.remove(arr[windowStart]);
              windowStart++;
          }
          max = Math.max(max, windowEnd - windowStart + 1);
      }
      return max;
    }
    public static void main(String[]args) {
        int result = FruitsIntoBaskets(new char[] {'A','B','C','B','B','C'});
        System.out.println(result);
    }
}
