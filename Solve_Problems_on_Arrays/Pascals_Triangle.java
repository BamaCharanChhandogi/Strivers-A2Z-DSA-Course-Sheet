package Solve_Problems_on_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> ls = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    ls.add(1);
                } else {
                    ls.add(ans.get(i - 2).get(j) + ans.get(i - 2).get(j - 1));
                }
            }
            ans.add(ls);
        }
        return ans;
    }

    public static void main(String[] args) {
        Pascals_Triangle solution = new Pascals_Triangle();
        int numRows = 5;
        List<List<Integer>> result = solution.generate(numRows);

        System.out.println("Generated Pascal's Triangle:");
        printTriangle(result);
    }

    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
