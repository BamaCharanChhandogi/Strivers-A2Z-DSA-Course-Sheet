package Learn_Bit_Manipulation;

import java.util.Scanner;
public class CountSetBits {
    public static int HighestPow(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }

    public static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        ;
        int x = HighestPow(n);
        int powBit = x * (1 << (x - 1));
        int msbit = n - (1 << x) + 1;
        int rest = n - (1 << x);
        int ans = powBit + msbit + solution(rest);
        return ans;
    }

    public static int countSetBits(int n) {
        // Write your code here
        int ans = solution(n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println(countSetBits(n));
    }

}
