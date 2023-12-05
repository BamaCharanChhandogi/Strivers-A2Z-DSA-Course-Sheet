

import java.util.Stack;

public class NextGreaterElement2 {
    static int[] nextGreaterElement(int N, int arr[]) {
        // code here
        Stack<Integer> ans=new Stack<>();
        for(int i=N-2;i>=0;i--){
            while(ans.size()>0 && arr[i]>=ans.peek()){
                ans.pop();
            }
            ans.push(arr[i]);
            
        }
        int ans2[]=new int[N];
        for(int i=N-1;i>=0;i--){
            while(ans.size()>0 && arr[i]>=ans.peek()){
                ans.pop();
            }
            ans2[i]=ans.size()==0?-1:ans.peek();
            ans.push(arr[i]);
            
        }
        return ans2;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        int ans[]=nextGreaterElement(arr.length,arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}
