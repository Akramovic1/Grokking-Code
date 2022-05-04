import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        if(targetSum == root.val && root.left == null && root.right == null)
            return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[]args) {

    }
}
