package Binary_Search.BS_on_Answers;

import java.util.*;
import java.util.Collections;

public class Allocate_Books {
    public static int StudentNumber(ArrayList<Integer> arr,int mid){
        int student=1;
        int countPages=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+countPages<=mid){
                countPages+=arr.get(i);
            }
            else{
                student++;
                countPages=arr.get(i);
            }
        }
        return student;
    }
    public static int findPages(ArrayList<Integer> arr,int m) {
        // Write your code here.
        int low=Collections.max(arr);
        int high=0;
        for(int i=0;i<arr.size();i++){
            high+=arr.get(i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int MaxStudent= StudentNumber(arr,mid);
            if(MaxStudent<=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int m=4;
        arr.add(25);
        arr.add(46);
        arr.add(28);
        arr.add(49);
        arr.add(24);
        System.out.println(findPages(arr,m));
    }
}
