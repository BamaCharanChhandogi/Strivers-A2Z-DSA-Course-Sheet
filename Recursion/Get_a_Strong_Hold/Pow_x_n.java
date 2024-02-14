package Recursion.Get_a_Strong_Hold;
public class Pow_x_n {
    double myPow(double x, int n) {
        if (n == 0)
            return 1;
        long  exp = n; // Convert n to long long
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        double result = 1;
        while (exp > 0) {
            if (exp % 2 == 1)
                result *= x;
            x *= x;
            exp /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Pow_x_n obj = new Pow_x_n();
        double x = 2.00000;
        int n = 10;
        System.out.println(obj.myPow(x, n));
    }
}