import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return maxDiameter;
        dfs(root);
        return maxDiameter;
    }
    public int dfs(TreeNode root){
        if(root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[]args) {

    }
}
