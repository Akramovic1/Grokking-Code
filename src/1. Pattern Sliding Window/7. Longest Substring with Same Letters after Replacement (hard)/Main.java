import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int CharacterReplacement(String str, int k){
       int windowStart = 0;
       int max = 0;
       int maxChars = 0;
       Map<Character, Integer> windowFreq = new HashMap<>();
       for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
           char rightChar = str.charAt(windowEnd);
           windowFreq.put(rightChar, windowFreq.getOrDefault(rightChar,0) + 1);
           maxChars = Math.max(maxChars, windowFreq.get(rightChar));
           if(windowEnd - windowStart + 1 - maxChars > k){
               char leftChar = str.charAt(windowStart);
               windowFreq.put(leftChar,windowFreq.get(leftChar) - 1);
               if(windowFreq.get(leftChar) == 0)    windowFreq.remove(leftChar);
               windowStart++;
           }
           max = Math.max(max, windowEnd - windowStart + 1);
       }
       return max;
    }
    public static void main(String[]args) {
        int result = CharacterReplacement("abccde", 1);
        System.out.println(result);
    }
}
