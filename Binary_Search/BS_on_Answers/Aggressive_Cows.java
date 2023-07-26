package Binary_Search.BS_on_Answers;

import java.util.Arrays;

public class Aggressive_Cows {
    public static boolean CanwePlease(int arr[],int dist,int cow){
        int countCow=1,last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                countCow++;
                last=arr[i];
            }
            if(countCow==cow) return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1]-stalls[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(CanwePlease(stalls,mid,k)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int arr[]={0,3,4,7,10,9};
        int cow=4;
        System.out.println(aggressiveCows(arr,cow));
    }
}
