package Learn_Bit_Manipulation;

public class Set_The_Rightmost_Unset_Bit {
    public static int set_the_rightmost_unset(int N) {
        int i = 0, j = -1;
        int value = N;
        while (value != 0) {
            if ((value & 1) == 0) {
                j = i;
                break;
            } else {
                i++;
                value >>= 1;
            }
        }
        if (j == -1) {
            return N;
        }
        return N | 1 << j;
    }
   public static void main(String[] args) {
        int value = 7;
        System.out.println(set_the_rightmost_unset(value));
    }
}
