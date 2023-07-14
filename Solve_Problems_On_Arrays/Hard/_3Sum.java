package Solve_Problems_On_Arrays.Hard;

import java.util.*;

public class _3Sum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        //ans
        List<List<Integer>> ans=new LinkedList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                int low=i+1,high=arr.length-1,c=0-arr[i];
                while(low<high){
                    if(arr[low]+arr[high]==c){
                        ans.add(Arrays.asList(arr[i],arr[low],arr[high]));
                        while(low<high && arr[low]==arr[low+1]){
                            low++;
                        }
                        while(low<high && arr[high]==arr[high-1]){
                            high--;
                        }
                        
                        low++;
                        high--;
                    }
                    else if(arr[low]+arr[high]<c){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }

        //printing ans
        System.out.println(ans);
    }
}
