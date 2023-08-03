package Strings.Basic_and_Easy_String_Problems;
public class Longest_Common_Prefix {
    public static String Common(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        int min=Math.min(s1.length(),s2.length());
        for(int i=0;i<min;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
        String result=strs[0];
        for(int i=0;i<strs.length;i++){
            result=Common(result,strs[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
