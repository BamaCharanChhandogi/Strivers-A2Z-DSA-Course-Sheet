package Binary_Search.BS_on_Answers;

import java.util.ArrayList;
import java.util.Collections;

public class Painters_Partition_Problem {
    public static int PaintersProblem(ArrayList<Integer> arr,int mid){
        int painter=1;
        int countPainter=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+countPainter<=mid){
                countPainter+=arr.get(i);
            }
            else{
                painter++;
                countPainter=arr.get(i);
            }
        }
        return painter;
    }
    public static int findLargestMinDistance(ArrayList<Integer> arr, int m)
    {
        //    Write your code here
        int low=Collections.max(arr);
        int high=0;
        for(int i=0;i<arr.size();i++){
            high+=arr.get(i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int MaxStudent= PaintersProblem(arr,mid);
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
        ArrayList<Integer> arr = new ArrayList<>();
        int m = 4;
        arr.add(25);
        arr.add(46);
        arr.add(28);
        arr.add(49);
        arr.add(24);
        System.out.println(findLargestMinDistance(arr, m));
    }
}
