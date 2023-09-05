package Recursion.Get_a_Strong_Hold;

import java.text.DecimalFormat;

public class Pow_x_n {
    public static double myPow(double x, int n) {
        double result = Math.pow(x, n);
        
        // Create a DecimalFormat object to format the result to 5 decimal places
        DecimalFormat df = new DecimalFormat("#.#####");
        
        // Format the result and parse it back to a double
        double formattedResult = Double.parseDouble(df.format(result));
        
        return formattedResult;
    }
    
    public static void main(String[] args) {
        double x = 2.3456789;
        int n = 3;
        
        double result = myPow(x, n);
        System.out.println("Result: " + result);
    }
}
