import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean StringPermutations(String str, String pattern){
       int windowStart = 0;
       int matched = 0;
       Map<Character, Integer> patternFreq = new HashMap<>();
       for (char c : pattern.toCharArray()) patternFreq.put(c,patternFreq.getOrDefault(c,0) + 1);
       for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
           char rightChar = str.charAt(windowEnd);
           if (patternFreq.containsKey(rightChar)){
               patternFreq.put(rightChar,patternFreq.get(rightChar) - 1);
               if (patternFreq.get(rightChar) == 0) matched++;
           }
           if (matched == patternFreq.size())   return true;
           if (windowEnd >= pattern.length() - 1){
               char leftChar = str.charAt(windowStart);
               if (patternFreq.containsKey(leftChar)){
                   if (patternFreq.get(leftChar) == 0)  matched--;
                   patternFreq.put(leftChar,patternFreq.get(leftChar) + 1);
               }
               windowStart++;
           }
       }
       return false;
    }
    public static void main(String[]args) {
        boolean result = StringPermutations("oidbcaf","abc");
        System.out.println(result);
    }
}
