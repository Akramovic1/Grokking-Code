import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        List<Integer> path = new ArrayList<>();
        return dfs(root, targetSum, path);
    }
    public static int dfs(TreeNode root, int s, List<Integer> path){
        if(root == null)
            return 0;
        int paths = 0, sum = 0;
        path.add(root.val);
        ListIterator<Integer> it = path.listIterator(path.size());
        while(it.hasPrevious()){
            sum += it.previous();
            if(sum == s)
                paths++;
        }
        paths += dfs(root.left, s, path);
        paths += dfs(root.right, s, path);
        path.remove(path.size() - 1);
        return paths;
    }

    public static void main(String[]args) {

    }
}
