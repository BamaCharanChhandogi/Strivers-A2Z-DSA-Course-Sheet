package Binary_Search.BS_on_1D_Arrays;

import java.util.ArrayList;

public class SingleElementinaSortedArray {
    public static int FindUniqueEle( ArrayList<Integer> arr){
        //base case
        if(arr.size()==1){
            return arr.get(0);
        }
        if(arr.get(0)!=arr.get(1)){
            return arr.get(0);
        }
        if(arr.get(arr.size()-1)!=arr.get(arr.size()-2)){
            return arr.get(arr.size()-1);
        }
        int low=1;
        int high=arr.size()-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(mid)!=arr.get(mid+1) && arr.get(mid)!=arr.get(mid-1)){
                return arr.get(mid);
            }
            else if((mid%2==0) && arr.get(mid)==arr.get(mid+1)|| (mid%2==1) && arr.get(mid)==arr.get(mid-1)){
                low=mid+1;
            }
            else{
                high=mid-1;;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        System.out.println(FindUniqueEle(list));
    }
}
