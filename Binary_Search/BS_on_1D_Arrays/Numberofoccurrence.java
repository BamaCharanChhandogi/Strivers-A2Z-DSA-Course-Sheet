package Binary_Search.BS_on_1D_Arrays;

public class Numberofoccurrence {
    public static int Numberofoccurrence(int arr[],int n,int k){
        int low=0;
        int high=n-1;
        int i=0,j=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                i=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                j=mid;
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;

            }
            else{
                low=mid+1;
                
            }
        }
        if(i==0 && j==0){
            return 0;
        }
        return j-i+1;
    }
    public static void main(String[] args) {
        // int arr[]={1,1,1,2,2,3,3};
        // int n=7;
        // int x=3;
        int arr[]={1,2,4,4,5};
        int n=5;
        int x=6;
        System.out.print(Numberofoccurrence(arr,n,x));
    }
}
