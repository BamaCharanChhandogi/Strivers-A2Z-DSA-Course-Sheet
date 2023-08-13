package Strings.Medium_String_Problems;

public class SumOfBeautyOfAllSubstrings {
    public static int beautySum(String s) {
        int count=0;
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1=s.substring(i, j);
                System.out.println(s1);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="aabcb";
        System.out.println(beautySum(s));
    }
    
}
