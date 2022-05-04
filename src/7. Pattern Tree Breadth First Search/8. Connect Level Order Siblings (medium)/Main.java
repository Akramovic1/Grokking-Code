import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public Node connect(Node root) {
        if(root == null)
            return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            Node prev = null;
            for(int i = 0; i < levelSize; i++){
                Node curr = q.poll();
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

    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}