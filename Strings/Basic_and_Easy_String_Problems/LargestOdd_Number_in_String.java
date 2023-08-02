package Strings.Basic_and_Easy_String_Problems;

public class LargestOdd_Number_in_String {
    public static String largestOddNumber(String num) {
        String ans="";
        for(int i=num.length()-1;i>-1;i--){
            if(num.charAt(i)%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s="52";
        System.out.println(largestOddNumber(s));
    }
}
