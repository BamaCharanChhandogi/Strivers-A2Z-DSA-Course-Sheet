package Strings.Medium_String_Problems;

import java.util.Stack;

public class ReverseEveryWordinAString {
    public static String reverseWords(String s) {
        String temp="";
        String ans="";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(temp.length()>0){
                    st.push(temp);
                    temp="";
                }
            }
            else{
                temp+=s.charAt(i);
            }

        }
        ans=ans+temp;
        while(!st.isEmpty()){
            ans=ans+" "+st.pop();
        }
        if(ans.length()!=0 && s.charAt(0)==' '){
            ans=ans.substring(1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(reverseWords(s));
    }
}
