package Recursion.Subsequences_Pattern;
import java.util.*;

public class Generate_all_binary_strings {
    public static void recursive(int n,List<String> ans,String ds){
        //base codition
        if(n==ds.length()){
            ans.add(ds);
            // System.out.println(ds);
            return;
        }
        else{
            recursive(n,ans,ds+'0');
        }
        
        // System.out.println(ds);
        if(ds.length()>0 && ds.charAt(ds.length()-1)!='1'){
            recursive(n,ans,ds+'1');
        }
        if(ds.length()==0){
            recursive(n,ans,ds+'1');
        }
    }
  public static List<String> generateBinaryStrings(int n) {
    // code here
    List<String> ans=new ArrayList<>();
    recursive(n,ans,"");
    return ans;
    
    

  }
  public static void main(String[] args) {
    System.out.println(generateBinaryStrings(3));
  }
}
