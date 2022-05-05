import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> p = new LinkedList<>();
        p.add(new ArrayList<>());
        for(int num : nums){
            int size = p.size();
            for(int i = 0; i < size; i++){
                List<Integer> list = p.poll();
                for(int j = 0; j <= list.size(); j++){
                    List<Integer> set = new ArrayList<>(list);
                    set.add(j,num);
                    if(set.size() == nums.length)
                        result.add(set);
                    else
                        p.add(set);
                }
            }
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
