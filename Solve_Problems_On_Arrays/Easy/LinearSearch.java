package Solve_Problems_On_Arrays.Easy;
public class LinearSearch {
    public static void main(String[] args) {
        // int arr[]={1,2,3,447,53,21};
        // int target=53;
        int arr[]={1,3,4,6,6};
        int target=2;
        //ans
        int low=0;
        boolean flag=false;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        //decide output
        if(flag){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}
