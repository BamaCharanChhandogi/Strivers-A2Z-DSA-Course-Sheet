package Recursion.Subsequences_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Subsets{
    public static void subset(List<List<Integer>> ans,int nums[],int ind,List<Integer> ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        subset(ans,nums,ind+1,ds);
        ds.remove(ds.size()-1);
        subset(ans,nums,ind+1,ds);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        subset(ans,nums,0,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int num[]={1,2,3};
        System.out.println(subsets(num));
    }
}