import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1,e2) -> e1.getValue() - e2.getValue());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++)
            res[i] = minHeap.poll().getKey();

        return res;
    }

    public static void main(String[]args){

    }
}
