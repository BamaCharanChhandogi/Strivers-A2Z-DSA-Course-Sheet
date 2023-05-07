package SolveProblemsOnArrays.Easy;

import java.util.Arrays;

public class MoveZerostoend {
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
        int arr[]={0,0,0,4};
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                break;
            }
        }
        Reverse(arr,i,arr.length-1);
        Reverse(arr,0,arr.length-1);

        //print array
        i=0;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
