
import java.util.*;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n) { 
        long[] result = new long[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) { // Corrected loop control variable
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return result;
    } 

    public static void main(String[] args) {
        int n = 4;
        long[] arr = {1, 3,2,4};
        long[] ans = nextLargerElement(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
