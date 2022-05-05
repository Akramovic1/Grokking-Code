import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num : nums){
            int size = result.size();
            for(int i = 0; i < size; i++){
                List<Integer> set = new ArrayList<>(result.get(i));
                set.add(num);
                result.add(set);
            }
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
