package Binary_Search.BS_on_1D_Array;

public class BinarySearchtofindXInSortedArray {
    public static int SearchingX(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
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
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int target=9;
        // int arr[]={-1,0,3,5,9,12};
        // int target=2;

        System.out.println(SearchingX(arr, target));
    }
}
