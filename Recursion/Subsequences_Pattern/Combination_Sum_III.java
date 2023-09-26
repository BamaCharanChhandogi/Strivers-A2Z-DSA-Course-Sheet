package Recursion.Subsequences_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
    public static void printCombination3(int k, int n,int i, List<List<Integer>> ans,List<Integer> ds){
        if(k==0 && n==0){
            ans.add(new ArrayList<Integer>(ds));
        }
        if(i>n||k==0||i==10){
            return;
        }
        ds.add(i);
        printCombination3(k-1,n-i,i+1,ans,ds);
        ds.remove(ds.size()-1);
        printCombination3(k,n,i+1,ans,ds);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        printCombination3(k, n,1, result,new ArrayList<>());
        return result;

    }
    public static void main(String[] args) {
        int n=7;
        int k=3;
        System.out.println(combinationSum3(k,n));
    }
}
