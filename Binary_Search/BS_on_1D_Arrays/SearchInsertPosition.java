package Binary_Search.BS_on_1D_Arrays;

public class SearchInsertPosition {
    public static int InsertionBS(int arr[],int m){
    
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==m){
                return mid;
            }
            else if(arr[mid]<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return  low;
    }
    public static void main(String[] args) {
        // int N=7;
        // int X=0;
        // int arr[]={1,2,8,10,11,12,19};
        int m=6;
        int arr[]={1,2,4,7};
        System.out.println(InsertionBS(arr,m));

    }
}
