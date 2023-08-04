package Strings.Basic_and_Easy_String_Problems;

public class p {
    public static String print(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            s.
        }
        return s;
    }
    public static void main(String[] args) {
        String s="I am bama";
        // System.out.println(s.length());
        String ans="";
        String ans2="";
        for(int i=0;i<s.length();i++){
            char sb=s.charAt(i);
            if(sb==' '|| s.length()-1==i){
                 ans+=sb;
                ans2+=print(ans);
                ans="";
            }
            else{
                ans+=sb;
            }
        }
        System.out.println(ans2);
    }
}
