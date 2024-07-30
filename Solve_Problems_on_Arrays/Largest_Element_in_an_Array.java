package Solve_Problems_on_Arrays;

public class Largest_Element_in_an_Array {
    public boolean check(int[] arr) {
        int n = arr.length;
        int count = 0;
        
        // Count the number of places where the array is not increasing
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        
        // The array can be sorted and rotated if and only if this count is at most 1
        return count <= 1;
    }

    public static void main(String[] args) {
        Largest_Element_in_an_Array solution = new Largest_Element_in_an_Array();
        int[] test1 = {3, 4, 5, 1, 2};
        int[] test2 = {2, 1, 3, 4};
        int[] test3 = {1, 2, 3, 4, 5};
        int[] test4 = {1, 1, 1};

        System.out.println("Test case 1: " + (solution.check(test1) ? "true" : "false"));
        System.out.println("Test case 2: " + (solution.check(test2) ? "true" : "false"));
        System.out.println("Test case 3: " + (solution.check(test3) ? "true" : "false"));
        System.out.println("Test case 4: " + (solution.check(test4) ? "true" : "false"));
    }
}
