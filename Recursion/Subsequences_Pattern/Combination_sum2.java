package Recursion.Subsequences_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sum2 {
    public static void printCombination2(int index,int arr[],int target,List<List<Integer>> ans,ArrayList<Integer> ds){
        //base
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        //main
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }

            ds.add(arr[i]);
            printCombination2(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        printCombination2(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr,8));
    }
}
