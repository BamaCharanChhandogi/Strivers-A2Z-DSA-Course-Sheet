package Binary_Search.BS_on_1D_Array;

public class ImplementLowerBound {
    public static int LowerBound(int arr[],int n,int x){
        //base case
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return  high+1;
    }
    public static void main(String[] args) {
        int N=7;
        int X=0;
        int arr[]={1,2,8,10,11,12,19};
        System.out.println(LowerBound(arr,N,X));

    }
}
