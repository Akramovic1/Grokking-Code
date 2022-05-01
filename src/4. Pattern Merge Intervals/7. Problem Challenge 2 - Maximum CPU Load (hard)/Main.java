package com.company;


import java.util.*;

public class Main {
    public static int findMaxCPULoad(List<Job> jobs) {
        Collections.sort(jobs, Comparator.comparingInt(a -> a.start));
        int maxCPULoad = 0;
        int currentCPULoad = 0;
        PriorityQueue<Job> minHeap = new PriorityQueue<>(jobs.size(), Comparator.comparingInt(a -> a.end));
        for (Job job : jobs){
            while (!minHeap.isEmpty() && job.start >= minHeap.peek().end)
                currentCPULoad -= minHeap.poll().cpuLoad;
            minHeap.add(job);
            currentCPULoad += job.cpuLoad;
            maxCPULoad = Math.max(maxCPULoad,currentCPULoad);
        }
        return maxCPULoad;
    }
    public static void main(String[] args) {
        List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3), new Job(2, 5, 4), new Job(4,8,4)));
        System.out.println("Maximum CPU load at any time: " + findMaxCPULoad(input));
    }

}
class Job {
    int start;
    int end;
    int cpuLoad;
    public Job(int start, int end, int cpuLoad) {
        this.start = start;
        this.end = end;
        this.cpuLoad = cpuLoad;
    }
}



