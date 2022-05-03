import java.util.*;

public class Main {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            double sum = 0;
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            result.add(sum/levelSize);
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
