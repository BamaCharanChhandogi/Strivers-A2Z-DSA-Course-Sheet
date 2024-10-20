import java.util.*;

public class GenerateParentheses {

    List<String> res = new ArrayList<>();

    public void solve(String str, int open, int close, int n) {
        if (open + close == n * 2) {
            res.add(str);
            return;
        }
        if (open == n) {
            solve(str + ')', open, close + 1, n);
        } else if (open > close) {
            solve(str + ')', open, close + 1, n);
            solve(str + '(', open + 1, close, n);
        } else {
            solve(str + '(', open + 1, close, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        solve("(", 1, 0, n);
        return res;
    }

    public static void main(String[] args) {
        GenerateParentheses obj = new GenerateParentheses();
        int n = 3;
        List<String> ans = obj.generateParenthesis(n);
        for (String str : ans) {
            System.out.println(str);
        }
    }
}
