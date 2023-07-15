package Binary_Search.BS_on_1D_Arrays;

public class SearchInRotatedSortedArray {
    public static int BSInSortedArray(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=k && arr[mid]>=k){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=k && arr[high]>=k){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={8,9,4,5};
        int k=4;
        System.out.println(BSInSortedArray(arr,k));
    }
}
