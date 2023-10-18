package Stack_AND_Queues;

import java.util.Stack;

public class Number_of_NGEs_to_the_right {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    // code here
    int ans[]=new int[queries];
    for(int i=0;i<queries;i++){
        int ele=arr[indices[i]];
        Stack<Integer> sc=new Stack<>();
        int j=N-1;
        while(j>indices[i]){
            if(arr[j]>ele){
                sc.push(arr[j]);
            }
            j--;
        }
        ans[i]=sc.size();
    }
     return ans;
  }
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 7, 5, 8, 10, 6};
        int queries = 2;
        int indices[] = {0, 5};
        int ans[]= count_NGEs(arr.length,arr,queries,indices);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}