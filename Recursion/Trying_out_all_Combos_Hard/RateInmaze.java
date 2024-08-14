import java.util.ArrayList;
import java.util.List;

class Choice {
    char dName;
    int dx, dy;

    Choice(char dName, int dx, int dy) {
        this.dName = dName;
        this.dx = dx;
        this.dy = dy;
    }
}

class Solution {
    public boolean isValid(int x, int y, int[][] mat) {
        return x >= 0 && x < mat.length && y >= 0 && y < mat[0].length && mat[x][y] == 1;
    }

    public void solve(int x, int y, StringBuilder path, List<String> res, int[][] mat, List<Choice> choices) {
        if (x == mat.length - 1 && y == mat[0].length - 1) {
            res.add(path.toString());
            return;
        }
        for (Choice choice : choices) {
            int newX = x + choice.dx;
            int newY = y + choice.dy;

            if (isValid(newX, newY, mat)) {
                mat[x][y] = 0; // Mark as visited
                path.append(choice.dName);
                solve(newX, newY, path, res, mat, choices);
                mat[x][y] = 1; // Unmark as visited
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

    public List<String> findPath(int[][] mat) {
        StringBuilder path = new StringBuilder();
        List<String> res = new ArrayList<>();
        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice('U', -1, 0));
        choices.add(new Choice('D', 1, 0));
        choices.add(new Choice('L', 0, -1));
        choices.add(new Choice('R', 0, 1));

        if (mat[0][0] == 1) {
            solve(0, 0, path, res, mat, choices);
        }

        return res;
    }
}

public class RateInmaze {
    
}
