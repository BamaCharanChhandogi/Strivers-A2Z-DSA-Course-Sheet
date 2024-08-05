package Solve_Problems_on_Arrays;
import java.util.ArrayList;

public class Set_matrix_Zero {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < row.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row.get(i)][j] = 0;
            }
        }
        for (int i = 0; i < col.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col.get(i)] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Set_matrix_Zero solution = new Set_matrix_Zero();
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        solution.setZeroes(matrix);

        System.out.println("Matrix after setZeroes:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
