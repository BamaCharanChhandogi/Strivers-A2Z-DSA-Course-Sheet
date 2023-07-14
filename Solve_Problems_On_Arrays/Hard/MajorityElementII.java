package Solve_Problems_On_Arrays.Hard;

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        //  int arr[]={3,2,3};
         int arr[]={1,2};
         //ans
         List<Integer> ans=new ArrayList<>();
         //test case
         if(arr.length==0){
            System.out.println(ans);
         }
        int candidates1=Integer.MAX_VALUE;
        int candidates2=Integer.MIN_VALUE;
        int life1=1;
        int life2=1;
        for(int i=0;i<arr.length;i++){
            if(candidates1==arr[i]){
                life1++;
            }
            else if(candidates2==arr[i]){
                life2++;
            }
           else if(life1==0){
                candidates1=arr[i];
                life1=1;
            }
           else if(life2==0){
                candidates2=arr[i];
                life2=1;
            }
            else{
                life1--;
                life2--;
            }
        }

        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(candidates1==arr[i]){
                count1++;
            }
            if(candidates2==arr[i]){
                count2++;
            }
        }
        //check
        if(count1>arr.length/3){
            ans.add(candidates1);
        }
        if(count2>arr.length/3){
            ans.add(candidates2);
        }
        //printing final answer
        System.out.println(ans);
    }
}
