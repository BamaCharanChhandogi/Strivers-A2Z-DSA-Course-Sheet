package Recursion.Get_a_Strong_Hold;

public class Count_Good_numbers {

    
    public static long  power(long x, long  y, long mod) {
        long res = 1;
        x %= mod;
        while (y > 0) {
            if ((y & 1)==1)
                res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
    }
    
    public static long countGoodNumbers(long n) {
        
        // Base case for the recursion
         long mod= 1000000007;
         long odd = n / 2;
         long even = n/2 + n%2;
         long ans = (power(5, even, mod) * power(4, odd, mod)) % mod;
         return ans;
    }
    
    public static void main(String[] args) {
        
        // Test cases
        long n1 = 1;
        long n2 = 4;
        long n3 = 50;
        
        long result1 = countGoodNumbers(n1);
        long result2 = countGoodNumbers(n2);
        long result3 = countGoodNumbers(n3);
        
        System.out.println("Result for n1 = " + n1 + ": " + result1);
        System.out.println("Result for n2 = " + n2 + ": " + result2);
        System.out.println("Result for n3 = " + n3 + ": " + result3);
    }
}
