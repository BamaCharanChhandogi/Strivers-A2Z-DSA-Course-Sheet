package SolveProblemsOnArrays.Medium;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 2 };
        int n = 4;
        // ans
        int k = n - 2;
        for (int i = n - 1; i >= 0; i--) { // finding k number
            if (arr[k] > arr[i]) {
                k--;
            }
        }

        // swap last largest with k
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[k]) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        // reverse number after k position
        int low = k + 1;
        int high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        // printing ans
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
