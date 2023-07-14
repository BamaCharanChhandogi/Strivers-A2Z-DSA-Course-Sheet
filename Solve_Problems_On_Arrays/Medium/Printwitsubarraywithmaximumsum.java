package Solve_Problems_On_Arrays.Medium;

public class Printwitsubarraywithmaximumsum {
    public static void main(String[] args) {
        // int arr[]={-1,-2,-3,-4};
        int arr[]={1,2,3,-2,5};
        //ans
        int low=0,high=0;
        int maxsum=arr[0];
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum>maxsum){
                high=i;
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }

        //output
        for(int i=low;i<=high;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
