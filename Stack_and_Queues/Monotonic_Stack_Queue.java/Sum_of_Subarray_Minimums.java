import java.util.*;
public class Sum_of_Subarray_Minimums {
    public static int sumSubarrayMins(int[] arr) {
        int count=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = i; k <=j; k++){
                    list.add(arr[k]);
                }
                count+=Collections.min(list);
            }
        }
      return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
        
    }
}
