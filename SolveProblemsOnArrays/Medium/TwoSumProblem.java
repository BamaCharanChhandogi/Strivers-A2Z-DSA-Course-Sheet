package SolveProblemsOnArrays.Medium;

public class TwoSumProblem {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        // int arr[]={3,3};
        // int target=6;
        // ans
        int low=0,high=0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for(int j=i;j<arr.length;j++){
                count += arr[j];
                if (count == target) {
                    System.out.println(i+","+j);
                    break;
                }
            }
        }
    }
}
