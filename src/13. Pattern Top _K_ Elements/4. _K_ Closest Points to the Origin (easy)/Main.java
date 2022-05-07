import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((arr1, arr2) -> ((arr2[0]*arr2[0] + arr2[1]*arr2[1]) - (arr1[0]*arr1[0] + arr1[1]*arr1[1])));
        for (int i = 0; i < k; i++)
            maxHeap.add(points[i]);
        for (int i = k; i < points.length; i++){
            int dis = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            int disHeap = maxHeap.peek()[0] *  maxHeap.peek()[0] +  maxHeap.peek()[1] *  maxHeap.peek()[1];
            if (dis < disHeap){
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }
        return maxHeap.toArray(new int[0][0]);
    }

    public static void main(String[]args){
        int[][] res = kClosest(new int[][]{{-5,4},{-6,-5},{4,6}},2);
        for (int[] arr : res)
            System.out.println(Arrays.toString(arr));
    }
}
