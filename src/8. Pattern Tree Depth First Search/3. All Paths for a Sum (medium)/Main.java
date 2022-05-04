import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        if(root == null)
            return allPaths;
        List<Integer> currPath = new ArrayList<>();
        dfs(root, targetSum, currPath, allPaths);
        return allPaths;
    }
    public static void dfs(TreeNode root, int targetSum, List<Integer> currPath, List<List<Integer>> allPaths){
        if(root == null)
            return;
        currPath.add(root.val);
        if(targetSum == root.val && root.left == null && root.right == null)
            allPaths.add(new ArrayList<>(currPath));
        else{
            dfs(root.left, targetSum - root.val, currPath, allPaths);
            dfs(root.right, targetSum - root.val, currPath, allPaths);
        }
        currPath.remove(currPath.size() - 1);
    }

    public static void main(String[]args) {

    }
}
