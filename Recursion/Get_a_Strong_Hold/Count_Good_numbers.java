package Recursion.Get_a_Strong_Hold;

public class Count_Good_numbers {
    
    // Define MOD as a class variable for easier reference and readability
    public long MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) {
        
        // Calculate the number of even and odd positions in the digit string
        long odd = n / 2;
        long even = (n + 1) / 2;
        
        // Calculate the total number of good digit strings
        // multiplying 5 by even because there could only be 5 even numbers between 0-9
        // multiplying 4 by odd because there could only be 4 prime numbers between 0-9
        return (int)(power(5, even) * power(4, odd) % MOD);
    }
    
    public long power(long x, long n) {
        
        // Base case for the recursion
        if (n == 0) 
            return 1;
        
        // Recursively calculate x^(n/2)
        long temp = power(x, n / 2);
        
        // If n is even, return (x^(n/2))^2
        if (n % 2 == 0) {
            return (temp * temp) % MOD;
        }
        // If n is odd, return (x^(n/2))^2 * x
        else {
            return (x * temp * temp) % MOD;
        }
    }
    
    public static void main(String[] args) {
        Count_Good_numbers solution = new Count_Good_numbers();
        
        // Test cases
        long n1 = 1;
        long n2 = 4;
        long n3 = 50;
        
        int result1 = solution.countGoodNumbers(n1);
        int result2 = solution.countGoodNumbers(n2);
        int result3 = solution.countGoodNumbers(n3);
        
        System.out.println("Result for n1 = " + n1 + ": " + result1);
        System.out.println("Result for n2 = " + n2 + ": " + result2);
        System.out.println("Result for n3 = " + n3 + ": " + result3);
    }
}
