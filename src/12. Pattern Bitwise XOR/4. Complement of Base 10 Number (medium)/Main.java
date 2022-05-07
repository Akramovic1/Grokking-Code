import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int findComplement(int num) {
        int noBits = 0;
        int temp = num;
        while(temp > 0){
            noBits++;
            temp >>= 1;
        }
        return num ^ (int)(Math.pow(2,noBits) - 1);
    }    public static void main(String[]args){

    }
}
