import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public List<Integer> findKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
            minHeap.add(nums[i]);
        for (int i = k; i < nums.length; i++){
            if (nums[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[]args){

    }
}
