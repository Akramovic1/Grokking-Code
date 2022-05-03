import java.util.*;

public class Main {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> level;
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            TreeNode curr = null;
            level = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                curr = q.poll();
                level.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
