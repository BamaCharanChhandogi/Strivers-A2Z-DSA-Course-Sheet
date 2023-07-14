package Binary_Search;

import java.util.ArrayList;

public class FirstandLastPositionofanElementInSortedArray {
    public static int[] FirstandLastPosition(ArrayList<Integer> arr,int n,int k){
        int low=0;
        int high=n-1;
        int ans[]={-1,-1};
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(mid)==k){
                ans[0]=mid;
                high=mid-1;
            }
            else if(arr.get(mid)<k){
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
            if(arr.get(mid)==k){
                ans[1]=mid;
                low=mid+1;
            }
            else if(arr.get(mid)>k){
                high=mid-1;

            }
            else{
                low=mid+1;
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        int k=2;
        int n=8;
        int ans[]=FirstandLastPosition(arr,n,k);
            System.out.println(ans[0]+" "+ans[1]);


    }
}
