package Solve_Problems_On_Arrays.Easy;

public class LongestsubarraywithgivensumPositive {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 3, 1,1,1,1,2,1 };
        int sum = 6;
        int low = 0, high = 0, count = 0;
        int length = 0, max = 0;
        ;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = i; j < arr.length; j++) {
                count += arr[j];
                if (count == sum) {
                    length = j - i + 1;
                    count = 0;
                    if (length > max) {
                        max = length;
                        low = i;
                        i = j + 1;
                        high = j;
                    }
                }
            }
        }

        // ans
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
