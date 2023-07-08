package Binary_Search;

public class ImplementLowerBound {
    public static int FindFloor(int arr[],int length,int target){
        //base case
        if(target<arr[0]){
            return -1;
        }
        int low=0;
        int high=length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        // int N=7;
        // int X=0;
        // int arr[]={1,2,8,10,11,12,19};
        int N=7;
        int X=5;
        int arr[]={1,2,8,10,11,12,19};
        System.out.println(FindFloor(arr,N,X));

    }
}
