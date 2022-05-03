import java.util.*;

public class Main {
    public int minDepth(TreeNode root) {
        int minDepth = 0;
        if(root == null)
            return minDepth;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            minDepth++;
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                if(curr.left == null && curr.right == null)
                    return minDepth;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return minDepth;
    }

    public static void main(String[]args) {

    }
}
