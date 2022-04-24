import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int LongestSubstringWithKDistinctCharacters(int k, String str){
      int max = Integer.MIN_VALUE;
      int windowStart = 0;
      Map<Character,Integer> windowFreq = new HashMap<>();
      for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
          char rightChar = str.charAt(windowEnd);
          windowFreq.put(rightChar,windowFreq.getOrDefault(rightChar, 0) + 1);
          while(windowFreq.size() > k){
              char leftChar = str.charAt(windowStart);
              windowFreq.put(leftChar, windowFreq.getOrDefault(leftChar , 0) - 1);
              if(windowFreq.get(leftChar) == 0) windowFreq.remove(leftChar);
              windowStart++;
          }
          max = Math.max(max, windowEnd - windowStart + 1);
      }
      return max;
    }
    public static void main(String[]args) {
        int result = LongestSubstringWithKDistinctCharacters(2,"araaci");
        System.out.println(result);
    }
}
