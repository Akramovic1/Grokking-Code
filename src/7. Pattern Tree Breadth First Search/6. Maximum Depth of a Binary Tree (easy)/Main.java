import java.util.*;

public class Main {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if(root == null)
            return maxDepth;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            maxDepth++;
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return maxDepth;
    }

    public static void main(String[]args) {

    }
}
