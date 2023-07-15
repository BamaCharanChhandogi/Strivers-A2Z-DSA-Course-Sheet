package Binary_Search.BS_on_1D_Arrays;
import java.util.*;
public class SearchInARotatedSortedArrayII {
    public static boolean BSSortedArray2(int A[],int key){
        Arrays.sort(A);
        int low=0;
        int high=A.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==key){
                return true;
            }
            else if(A[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={31,44,56,0,10,13};
        int key=44;
        System.out.println(BSSortedArray2(arr,key));
    }
}
