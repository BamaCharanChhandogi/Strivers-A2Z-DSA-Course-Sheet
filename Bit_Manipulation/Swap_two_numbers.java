package Learn_Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class Swap_two_numbers {
    public static List<Integer> get(int a,int b)
    {
        List<Integer> result = new ArrayList<>();
        a= a^b;
        b= a^b;
        a= a^b;
        result.add(a);
        result.add(b);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(get(9,10));
    }
}
