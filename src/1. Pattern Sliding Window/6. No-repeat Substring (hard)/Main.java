import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int FruitsIntoBaskets(String str){
      int max  = Integer.MIN_VALUE;
      int windowStart = 0;
      Map<Character, Integer> windowFreq = new HashMap<>();
      for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
          char rightChar = str.charAt(windowEnd);
          while(windowFreq.containsKey(rightChar)){
              char leftChar = str.charAt(windowStart);
              windowFreq.put(leftChar,windowFreq.get(leftChar) - 1);
              if(windowFreq.get(leftChar) == 0) windowFreq.remove(leftChar);
              windowStart++;
          }
          windowFreq.put(rightChar,windowFreq.getOrDefault(rightChar,0) + 1);
          max = Math.max(max, windowEnd - windowStart + 1);
      }
      return max;
    }
    public static void main(String[]args) {
        int result = FruitsIntoBaskets("abccde");
        System.out.println(result);
    }
}
