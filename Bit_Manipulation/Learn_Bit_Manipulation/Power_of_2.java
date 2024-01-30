package Learn_Bit_Manipulation;


public class Power_of_2 {
    public static boolean isPowerofTwo(long n){
        // Your code here
        if(n==0){
            return false;
        }
        long res=n &(n-1);
        if(res==0){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
