package Recursion.Subsequences_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2{
    /**
     * The function "printsubsetsum2" generates all possible subsets of an array of integers, excluding
     * duplicates, and stores them in a list of lists.
     * 
     * @param index The index parameter represents the current index of the array that we are
     * considering. It helps in keeping track of the elements that have already been included in the
     * current subset.
     * @param nums An array of integers from which subsets will be generated.
     * @param ans The parameter "ans" is a list of lists of integers. It is used to store the subsets
     * of the given array that have a specific sum. Each subset is represented as a list of integers.
     * @param ds The parameter "ds" is an ArrayList that is used to store the current subset of
     * numbers. It is passed as a parameter to the recursive function "printsubsetsum2" and is used to
     * keep track of the numbers in the current subset.
     */
    public static void printsubsetsum2(int index,int nums[],List<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            printsubsetsum2(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    /**
     * The function subsetsWithDup takes an array of integers as input, sorts it, and returns a list of
     * all possible subsets of the array (including duplicates).
     * 
     * @param nums An array of integers that contains the input numbers.
     * @return The method is returning a list of lists of integers.
     */
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        printsubsetsum2(0,nums,ans,new ArrayList<>());
        return ans;
    }

    
    /**
     * The main function calls the subsetsWithDup function with an array of integers and prints the
     * result.
     */
    public static void main(String[] args) {
        int num[]={1,2,2};
        List<List<Integer>> ans=subsetsWithDup(num);
        System.out.println(ans);
    }
}