package Recursion.Subsequences_Pattern;

public class subsequence_with_sum_K {
    // User function Template for Java
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        return isSubsetSum(arr, N, K);
    }

    // Recursive function to check if there is a subsequence with the given sum
    public static boolean isSubsetSum(int[] arr, int N, int sum) {
        // Base cases
        if (sum == 0) {
            return true; // Found a subsequence with the given sum
        }
        if (N == 0 || sum < 0) {
            return false; // No more elements or sum became negative
        }

        // Exclude the last element and check if there's a subsequence with the sum
        boolean excludeLast = isSubsetSum(arr, N - 1, sum);

        // Include the last element and check if there's a subsequence with the sum
        boolean includeLast = isSubsetSum(arr, N - 1, sum - arr[N - 1]);

        // Return true if either of the two cases is true
        return excludeLast || includeLast;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 7;
        System.out.println(checkSubsequenceSum(arr.length, arr, k));
    }
}
