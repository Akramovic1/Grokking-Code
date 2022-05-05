import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++){
            start = 0;
            if(i > 0 && nums[i] == nums[i - 1])
                start = end + 1;
            end = result.size() - 1;
            for(int j = start; j < end + 1; j++){
                List<Integer> set = new ArrayList<>(result.get(j));
                set.add(nums[i]);
                result.add(set);
            }
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
