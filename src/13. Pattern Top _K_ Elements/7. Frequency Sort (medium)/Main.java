import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0) + 1);
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1,e2) -> e2.getValue() - e1.getValue());
        maxHeap.addAll(map.entrySet());
        StringBuilder res = new StringBuilder(s.length());
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for(int i = 0; i < entry.getValue(); i++)
                res.append(entry.getKey());
        }
        return res.toString();
    }

    public static void main(String[]args){

    }
}
