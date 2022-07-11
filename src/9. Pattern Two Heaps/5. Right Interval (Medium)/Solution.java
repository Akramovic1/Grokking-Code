class Solution {
    public int[] findRightInterval(int[][] intervals) {
        PriorityQueue<Integer> maxStart = new PriorityQueue<>((a,b)-> intervals[b][0] - intervals[a][0]);
        PriorityQueue<Integer> maxEnd = new PriorityQueue<>((a,b)-> intervals[b][1] - intervals[a][1]);
        int[] result = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            maxStart.add(i);
            maxEnd.add(i);
        }
        while(!maxEnd.isEmpty()){
            int endIndex = maxEnd.poll();
            int startIndex = -1;
            while(!maxStart.isEmpty() && intervals[endIndex][1] <= intervals[maxStart.peek()][0])
                startIndex = maxStart.poll();
            result[endIndex] = startIndex;
            if(startIndex != -1)
                maxStart.add(startIndex);
        }
        return result;
    }
}