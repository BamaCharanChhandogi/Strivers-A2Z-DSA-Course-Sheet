package Strings.Medium_String_Problems;

public class MaximuNesting_Depth_of_the_Parentheses {
    public static int maxDepth(String s) {
        int depth = 0;
        int open = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                open++;
            }
            if(c==')'){
                open--;
            }
            depth = Math.max(depth,open);
        }
        return depth;
    }
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
        
    }
}
