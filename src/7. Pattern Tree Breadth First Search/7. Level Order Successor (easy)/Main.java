import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static TreeNode findSuccessor(TreeNode root, int key) {
        if(root == null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                if (curr.val == key)
                    return q.peek();
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return null;
    }

    public static void main(String[]args) {

    }
}
