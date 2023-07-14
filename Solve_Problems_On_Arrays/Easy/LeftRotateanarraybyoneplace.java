package Solve_Problems_On_Arrays.Easy;

public class LeftRotateanarraybyoneplace {
    public static void Reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int left=2;
        Reverse(arr,0,left-1);
        Reverse(arr, left, arr.length-1);
        Reverse(arr, 0, arr.length-1);
        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
