package Recursion.Subsequences_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static void printper(String ds,List<String> ans,int o,int c,int n){
        if(ds.length()==2*n){
            ans.add(ds);
        }
        if(o<n){
            printper(ds+"(",ans,o+1,c,n);
        }
        if(c<o){
            printper(ds+")",ans,o,c+1,n);
        }
    }
    
    public static List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> ans=new ArrayList<>();
        printper("(",ans,1,0,n);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(AllParenthesis(3));
    }
}
