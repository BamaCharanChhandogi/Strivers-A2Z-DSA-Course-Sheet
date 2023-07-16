package Binary_Search.BS_on_1D_Arrays;

import java.util.Arrays;

public class FindMinimuminRotatedSortedArray {
    public static int findMinimum(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(findMinimum(arr));
    }
}
