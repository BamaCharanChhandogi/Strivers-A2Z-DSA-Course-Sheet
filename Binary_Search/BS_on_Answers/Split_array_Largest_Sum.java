package Binary_Search.BS_on_Answers;

import java.util.Arrays;

public class Split_array_Largest_Sum {
    public static int SubarrayCount(int arr[],int mid){
        int Count=1;
        int TotalSubarray=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+TotalSubarray<=mid){
                TotalSubarray+=arr[i];
            }
            else{
                Count++;
                TotalSubarray=arr[i];
            }
        }
        return Count;
    }
    public static int largestSubarraySumMinimized(int arr[], int m) {
    
        int low=Arrays.stream(arr).max().getAsInt();
        int high=0;
        for(int i=0;i<arr.length;i++){
            high+=arr[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int MaxStudent= SubarrayCount(arr,mid);
            if(MaxStudent<=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int m=3;
        System.out.println(largestSubarraySumMinimized(arr,m));
    }
}
