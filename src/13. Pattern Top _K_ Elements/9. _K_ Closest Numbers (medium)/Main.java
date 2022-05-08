import java.util.*;

public class Main {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Point> minHeap = new PriorityQueue<>((p1,p2) -> p1.val - p2.val);
        int index = search(arr, x);
        int start = Math.max(0, index - k);
        int end = Math.min(arr.length - 1, index + k);
        for(int i = start; i <= end; i--){
            Point curr = new Point(arr[i], Math.abs(arr[i] - x));
            minHeap.add(curr);
        }
        for(int i = 0; i < k; i++)
            result.add(minHeap.poll().key);
        Collections.sort(result);
        return result;
    }
    public int search(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            if(target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return (start > 0) ? start - 1 : start;
    }

    public static void main(String[]args){

    }
}
class Point{
    int key;
    int val;
    Point(int key, int val){
        this.key = key;
        this.val = val;
    }

}