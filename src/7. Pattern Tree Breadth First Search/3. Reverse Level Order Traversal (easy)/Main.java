import java.util.*;

public class Main {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null)
            return result;
        Queue<TreeNode> q  = new LinkedList<>();
        List<Integer> level;
        TreeNode curr;
        int levelSize;
        q.add(root);
        while(!q.isEmpty()){
            levelSize = q.size();
            level = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                curr = q.poll();
                level.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            result.add(0, level);
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
