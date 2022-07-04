import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int start = 0, end = 0, matching = 0;
        SubString sub  = new SubString(Integer.MAX_VALUE,0,0);
        for(end = 0; end < s.length(); end ++){
            char rightChar = s.charAt(end);
            if(map.containsKey(rightChar)){
                map.put(rightChar, map.get(rightChar) - 1);
                if(map.get(rightChar) == 0)
                    matching++;
            }
            while(end - start + 1 >= t.length() && matching == map.size()){
                char leftChar = s.charAt(start);
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0)
                        matching--;
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                if(sub.size > end - start + 1){
                    sub.size = end - start + 1;
                    sub.start = start;
                    sub.end = end;
                }
                start++;
            }
        }
        return (sub.size == Integer.MAX_VALUE) ? "" : s.substring(sub.start, sub.end + 1);
    }
    class SubString{
        int size;
        int start;
        int end;
        public SubString(int size, int start, int end){
            this.size = size;
            this.start = start;
            this.end = end;
        }
    }
}

