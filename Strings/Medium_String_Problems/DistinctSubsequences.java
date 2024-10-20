import java.util.Arrays;

public class DistinctSubsequences {
    
    public static int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return fun(0, 0, s, t, dp);
    }

    public static int fun(int i, int j, String s, String t, int[][] dp) {
        if (j == t.length()) {
            return 1;
        }
        if (i == s.length()) {
            return 0;
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int take = 0;
        if (s.charAt(i) == t.charAt(j)) {
            take = fun(i + 1, j + 1, s, t, dp);
        }
        
        int nonTake = fun(i + 1, j, s, t, dp);
        
        dp[i][j] = take + nonTake;
        return dp[i][j];
    }

    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct(s, t));  // Output: 3
    }
}
