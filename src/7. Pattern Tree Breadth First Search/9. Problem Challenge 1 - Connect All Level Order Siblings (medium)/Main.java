import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static TreeNode connect(TreeNode root) {
        if(root == null)
            return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode prev = null;
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                if(prev != null)
                    prev.next = curr;
                prev = curr;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return root;
    }

    public static void main(String[]args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        connect(root);
        root.printTree();
    }
}
