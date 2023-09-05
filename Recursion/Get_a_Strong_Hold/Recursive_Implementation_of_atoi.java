package Recursion.Get_a_Strong_Hold;

public class Recursive_Implementation_of_atoi {
    public static int myAtoi(String s) {
        if(s==null) return 0;

        s=s.trim();
        
        if(s.length()==0) return 0;
        
        int sign = +1;
        long ans = 0;
        if(s.charAt(0) == '-') sign = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
		// initiate the starting pointer
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i)-'0';
            // check the conditions
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            
            i++;
        }
        return (int)(sign*ans);
    }
    
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
