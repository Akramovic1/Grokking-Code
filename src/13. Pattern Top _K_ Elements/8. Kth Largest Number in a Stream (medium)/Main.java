import java.util.*;

public class Main {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    final int k;
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums)
            minHeap.add(num);
    }

    public int add(int val) {
        minHeap.add(val);
        while(minHeap.size() > this.k)
            minHeap.poll();
        return minHeap.peek();
    }

    public static void main(String[]args){

    }
}
