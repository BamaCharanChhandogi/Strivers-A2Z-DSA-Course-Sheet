import java.util.*;

class Solution {
    public static boolean isSafe(char nq[][], int row, int col) {
        // Vertical Up direction
        for (int i = row - 1; i >= 0; i--) {
            if (nq[i][col] == 'Q') return false;
        }
        // Diagonal left direction
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nq[i][j] == 'Q') return false;
        }
        // Diagonal right direction
        for (int i = row - 1, j = col + 1; i >= 0 && j < nq.length; i--, j++) {
            if (nq[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void nQueens(char nq[][], int row, List<List<String>> ans) {
        if (row == nq.length) {
            ans.add(convertToResult(nq));
            return;
        }
        for (int i = 0; i < nq.length; i++) {
            if (isSafe(nq, row, i)) {
                nq[row][i] = 'Q';
                nQueens(nq, row + 1, ans);
                nq[row][i] = '.';
            }
        }
    }

    private static List<String> convertToResult(char[][] nq) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nq.length; i++) {
            result.add(new String(nq[i]));
        }
        return result;
    }

    public List<List<String>> solveNQueens(int n) {
        char nq[][] = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nq[i][j] = '.';
            }
        }
        nQueens(nq, 0, ans);
        return ans;
    }
}
public class NQueens {
    public static void main(String[] args) {
        Solution s=new Solution();
        List<List<String>> ans=s.solveNQueens(4);
        // print ans
        for(List<String> l:ans){
            for(String str:l){
                System.out.println(str);
            }
            System.out.println();
        }
    }
}