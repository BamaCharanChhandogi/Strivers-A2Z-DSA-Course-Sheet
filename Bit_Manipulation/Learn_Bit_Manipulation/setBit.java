package Learn_Bit_Manipulation;

public class setBit {
    public static boolean checkKthBit(int n, int k)
    {
        int res = 1 << k;
        int ans = res & n;
        return ans != 0;
    }
    public static void main(String[] args){
        System.out.println(checkKthBit(4,2));
    }
}
