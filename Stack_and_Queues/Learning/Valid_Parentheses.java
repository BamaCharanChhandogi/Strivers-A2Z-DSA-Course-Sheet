package Stack_and_Queues.Learning;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int length=s.length();
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<length;i++){
            if(ans.isEmpty()){
                ans.push(s.charAt(i));
            }
            else if((ans.peek()=='(' && s.charAt(i)==')') || (ans.peek()=='{' && s.charAt(i)=='}') || (ans.peek()=='[' && s.charAt(i)==']')){
                ans.pop();

            }
            else{
                ans.push(s.charAt(i));
            }
        }
        if(ans.size()==0){
            return true;
        }
        return false;
    }
}
public class Valid_Parentheses {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isValid("({[]})"));
    }
}
