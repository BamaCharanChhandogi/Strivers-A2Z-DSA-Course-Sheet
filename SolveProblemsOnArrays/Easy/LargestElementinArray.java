package SolveProblemsOnArrays.Easy;
public class LargestElementinArray {
    public static void main(String[] args) {
        // create an example array
        int[] arr = {3, 5, 1, 8, 2, 7};
        //

        // find the largest element
        int largest = largest(arr, arr.length);

        // print the result
        System.out.println("The largest element is: " + largest);
    }

    public static int largest(int arr[], int n) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
