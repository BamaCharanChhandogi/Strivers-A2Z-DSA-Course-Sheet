package Binary_Search.BS_on_1D_Arrays;

import java.util.ArrayList;

public class FindpeakElement {
    public static boolean FindUniqueEle( ArrayList<Integer> arr){
        //base case
        if(arr.size()==1){
            return true;
        }
        if(arr.get(0)>arr.get(1)){
            return true;
        }
        if(arr.get(arr.size()-1)>arr.get(arr.size()-2)){
            return true;
        }
        int low=1;
        int high=arr.size()-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(mid)>arr.get(mid+1) && arr.get(mid)>arr.get(mid-1)){
                return true;
            }
            else if(arr.get(mid)>arr.get(mid-1)){
                low=mid+1;
            }
            else{
                high=mid-1;;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(FindUniqueEle(list));
    }
}
