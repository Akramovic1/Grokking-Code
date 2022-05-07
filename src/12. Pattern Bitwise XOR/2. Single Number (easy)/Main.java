import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
    public static void main(String[]args) {

    }
}
