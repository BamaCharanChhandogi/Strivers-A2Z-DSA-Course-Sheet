import java.util.*;

public class  Sum_of_Subarray_Minimums {
    public static int sumSubarrayMins(int[] arr) {

// The commented code is a nested loop that generates all possible subarrays of the given array `arr`.
// It is O(n3) solution
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i; j < arr.length; j++){
        //         ArrayList<Integer> list = new ArrayList<>();
        //         for(int k = i; k <=j; k++){
        //             list.add(arr[k]);
        //         }
        //         System.out.println(Collections.min(list));
        //     }
        // }

        //* O(n) solution *//

            int ans = 0;
            Stack<Integer> st = new Stack<>();
            long mod = (long)1000000007;
            st.push(-1);
            for (int i= 0; i < arr.length+1; i++){
                int currVal = (i<=arr.length-1)? arr[i] : 0;
                while(st.peek() !=-1 && currVal<arr[st.peek()]){
                    int index = st.pop();
                    int j = st.peek();
                    int left = index - j;
                    int right = i - index;
                    long add = (left * right * (long)arr[index]) % mod;
                    ans += add ;
                    ans %= mod;
                }
                st.push(i);
            }
            return ans;
        }
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}