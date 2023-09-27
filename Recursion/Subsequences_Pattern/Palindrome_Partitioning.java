package Recursion.Subsequences_Pattern;

import java.util.*;

public class Palindrome_Partitioning {
    /**
     * The function checks if a given string is a palindrome by comparing characters from both ends of
     * the string.
     * 
     * @param s The parameter "s" is a string that we want to check if it is a palindrome.
     * @return The method isPalindrome is returning a boolean value. It returns true if the given
     * string s is a palindrome, and false otherwise.
     */
    public static boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start <= end) {
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    /**
     * The function "PalinPartion" partitions a given string into all possible palindrome substrings
     * and stores them in a list of lists.
     * 
     * @param s The input string that needs to be partitioned into palindromic substrings.
     * @param ans The parameter "ans" is a list of lists of strings. It is used to store the final
     * result, which is a list of all possible palindrome partitions of the input string "s".
     * @param ds The parameter "ds" is a list of strings that stores the current partition of the given
     * string "s".
     */
    public static void PalinPartion(String s,List<List<String>> ans,List<String> ds){
        if(s.length()==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String s1=s.substring(0,i);
            if(isPalindrome(s1)){
                ds.add(s1);
                PalinPartion(s.substring(i,s.length()),ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    // The `partition` method takes a string `s` as input and returns a list of lists of strings. It
    // uses the `PalinPartion` method to partition the input string into all possible palindrome
    // substrings and stores them in the `result` list. The `main` method calls the `partition` method
    // with the input string "aab" and prints the result.
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        PalinPartion(s, result, new ArrayList<>());
        return result;
    }
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
}
