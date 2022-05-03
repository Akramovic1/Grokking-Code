import java.util.*;

public class Main {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();

                if(leftToRight)
                    level.add(curr.val);
                else
                    level.add(0, curr.val);

                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);

            }
            result.add(level);
            leftToRight = !leftToRight;
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
