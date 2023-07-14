package Binary_Search.BS_on_1D_Arrays;

import java.util.*;

public class CeilinSortedArray {
    public static int FloorAndCeil(int arr[],int x){
        Arrays.sort(arr);
        int floor=-1;
        int ceil=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                floor=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ceil=arr[mid];
                high=mid-1;
            }
            else{ 
                low=mid+1;
            }
        }
        System.out.print(floor+" ");
        return ceil;
    }
    public static void main(String[] args) {
        int arr[]={4,3,8,4,7,10};
        int x=2;
        System.out.print(FloorAndCeil(arr,x));
    }
}
