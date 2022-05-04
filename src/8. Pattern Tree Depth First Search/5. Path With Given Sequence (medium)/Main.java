import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static boolean findPath(TreeNode root, int[] seq) {
        if (root == null)
            return false;
        return dfs(root, seq, 0);
    }
    public static boolean dfs(TreeNode root, int[] seq, int index){
        if (root == null)
            return false;
        if (index > seq.length - 1 || seq[index] != root.val)
            return false;
        if (root.left == null && root.right == null && seq[index] == root.val && seq.length-1 == index)
            return true;
        return dfs(root.left, seq, index+1) || dfs(root, seq, index+1);
    }

    public static void main(String[]args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path sequence: " + findPath(root, new int[] {1,0,7}));
        System.out.println("Tree has path sequence: " + findPath(root, new int[]{1,0,6}));
        System.out.println("Tree has path sequence: " + findPath(root, new int[]{1,0,1}));
    }
}
