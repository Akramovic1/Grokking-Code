class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> profits[b] - profits[a]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> capital[a] - capital[b]);
        for(int i = 0; i < capital.length; i++)
            minHeap.add(i);
        for(int i = 0; i < k; i++){
            while(!minHeap.isEmpty() && capital[minHeap.peek()] <= w)
                maxHeap.add(minHeap.poll());
            if(maxHeap.size() == 0)
                break;
            w += profits[maxHeap.poll()];
        }
        return w;
    }
}