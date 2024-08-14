import java.util.*;
class Solution {
    boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
    public void fun(String s,List<List<String>> ans,List<String> ds,int ind){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                fun(s,ans,ds,i+1);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        fun(s,ans,ds,0);
        return ans;
    }
}
public class PalindromePartitioning {
    public static void main(String[] args) {
        Solution s=new Solution();
        List<List<String>> ans=s.partition("aab");
        for(List<String> i:ans){
            System.out.println(i);
        }
    }
}
