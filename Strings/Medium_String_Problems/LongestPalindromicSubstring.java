package Strings.Medium_String_Problems;

public class  LongestPalindromicSubstring {
    public static boolean ispalindrome(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<=j){
            char ch1=s1.charAt(i);
            char ch2=s1.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static String longestPalindrome(String ans) {
        int max=0;
        String ans1="";
        for(int i=0;i<ans.length();i++){
            for(int j=i+1;j<=ans.length();j++){
                String s1=ans.substring(i, j);
                System.out.println(s1);
                if(ispalindrome(s1)==true){
                     if(s1.length()>max){
                        max=s1.length();
                        ans1=s1;
                     }
                }
                
            }
        }
        return ans1;
    }
    public static void main(String[] arg){
        String s="aabc";
        System.out.println(longestPalindrome(s));
    }
    
}

