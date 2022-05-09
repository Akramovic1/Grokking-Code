import java.util.*;

public class Main {
    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        if (capacity <= 0 || profits.length == 0 || profits.length != weights.length)
            return 0;
        int[][] dp = new int[profits.length][capacity + 1];
        for (int i = 0; i < profits.length; i++)
            dp[i][0] = 0;
        for (int c = 0; c < capacity + 1; c++)
            if (weights[0] <= c)
                dp[0][c] = profits[0];

        for (int i = 1; i < profits.length; i++){
            for (int c = 1; c < capacity + 1; c++){
                int p1 = 0, p2 = 0;
                if (weights[i] <= c)
                    p1 = profits[i] + dp[i-1][c-weights[i]];
                p2 = dp[i-1][c];
                dp[i][c] = Math.max(p1, p2);
            }
        }
        return dp[profits.length - 1][capacity];
    }

    public static void main(String[]args){

    }
}
