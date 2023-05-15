package SolveProblemsOnArrays.Easy;

public class Findmissingnumberinanarray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3 };
        int n = 4;

        // ans
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // we calculate total sum in array
            sum += arr[i];
        }
        // Next we have to Calculate 1toN sum
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }

        int ans = sum1 - sum;
        System.out.println("Missing Number is: " + ans);
    }

}
