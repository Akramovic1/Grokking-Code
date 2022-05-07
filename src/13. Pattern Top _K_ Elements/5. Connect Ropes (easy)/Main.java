import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static int nivCostToConnectRopes(int[] ropes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : ropes)
            minHeap.add(rope);
        int result = 0;
        while (minHeap.size() > 1){
            int temp = minHeap.poll() + minHeap.poll();
            result += temp;
            minHeap.add(temp);
        }
        return result;
    }

    public static void main(String[]args){

    }
}
