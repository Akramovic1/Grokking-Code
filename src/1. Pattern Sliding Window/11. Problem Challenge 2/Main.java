import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Integer> stringAnagrams (String str, String pattern){
       int windowStart = 0;
       int matched = 0;
       Map<Character, Integer> patternFreq = new HashMap<>();
       List<Integer> indices = new ArrayList<>();
       for (char c : pattern.toCharArray()) patternFreq.put(c,patternFreq.getOrDefault(c,0) + 1);
       for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
           char rightChar = str.charAt(windowEnd);
           if (patternFreq.containsKey(rightChar)){
               patternFreq.put(rightChar,patternFreq.get(rightChar) - 1);
               if (patternFreq.get(rightChar) == 0) matched++;
           }
           if (matched == patternFreq.size())   indices.add(windowStart);
           if (windowEnd >= pattern.length() - 1){
               char leftChar = str.charAt(windowStart);
               if (patternFreq.containsKey(leftChar)){
                   if (patternFreq.get(leftChar) == 0)  matched--;
                   patternFreq.put(leftChar,patternFreq.get(leftChar) + 1);
               }
               windowStart++;
           }
       }
       return indices;
    }
    public static void main(String[]args) {
        List<Integer> result = stringAnagrams("cbaebabacd","abc");
        System.out.println(result);
    }
}
