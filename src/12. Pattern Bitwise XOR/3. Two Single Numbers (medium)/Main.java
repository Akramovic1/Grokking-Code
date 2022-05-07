import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int[] singleNumber(int[] nums) {
        int nxn = 0;
        for(int num : nums)
            nxn ^= num;
        int rightBit = 1;
        while((rightBit & nxn) == 0)
            rightBit = rightBit << 1;
        int n1 = 0, n2 = 0;
        for(int num : nums){
            if((num & rightBit) != 0)
                n1 ^= num;
            else
                n2 ^= num;
        }
        return new int[]{n1,n2};
    }
    public static void main(String[]args) {

    }
}
