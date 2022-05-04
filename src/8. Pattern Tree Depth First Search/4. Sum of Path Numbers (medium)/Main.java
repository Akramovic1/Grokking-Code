import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        return dfs(root, sum);
    }
    public int dfs(TreeNode root, int sum){
        if(root == null)
            return 0;
        sum = 10 * sum + root.val;
        if(root.left == null && root.right == null)
            return sum;
        return dfs(root.left, sum) + dfs(root.right, sum);
    }

    public static void main(String[]args) {

    }
}
