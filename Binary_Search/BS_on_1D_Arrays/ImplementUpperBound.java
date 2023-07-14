package Binary_Search.BS_on_1D_Arrays;

public class ImplementUpperBound {
    public static int UpperBound(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return  high+1;
    }
    public static void main(String[] args) {
        int N=5;
        int X=10;
        int arr[]={1,2,5,6,10};
        System.out.println(UpperBound(arr,N,X));
    }
}
