package Stack_AND_Queues;

import java.util.Stack;

public class Immediate_Smaller_Element {
    public static void immediateSmaller(int arr[], int n) {
        // code here
        Stack<Integer> stack=new Stack<>(); 
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        arr[n-1]=-1;
        for(int i=arr.length-2; i>=0; i--){
            if(stack.peek()<arr[i]){

                arr[i]=stack.peek();
            }else{
                arr[i]=-1;
            }
            stack.pop();
   }
}
    public static void main(String[] args) {
        int arr[] = {4,2,1,5,3};
        immediateSmaller(arr, arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}