import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingMediansFinder {
    private PriorityQueue<Integer> heapMin = new PriorityQueue<>();
    private PriorityQueue<Integer> heapMax = new PriorityQueue<>(Collections.reverseOrder());
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            if(heapMax.isEmpty() || nums[i] <= heapMax.peek())
                heapMax.add(nums[i]);
            else
                heapMin.add(nums[i]);
            rebalance();
            if(i - k + 1 >= 0){
                if(heapMax.size() == heapMin.size())
                    result[i - k + 1] = heapMax.peek() / 2.0 + heapMin.peek() / 2.0;
                else
                    result[i - k + 1] = heapMax.peek();

                int rem = nums[i - k + 1];
                if(rem <= heapMax.peek())
                    heapMax.remove(rem);
                else
                    heapMin.remove(rem);
                rebalance();
            }
        }
        return result;
    }
    private void rebalance(){
        if(heapMax.size() > heapMin.size() + 1)
            heapMin.add(heapMax.poll());
        else if(heapMin.size() > heapMax.size())
            heapMax.add(heapMin.poll());
    }
}
