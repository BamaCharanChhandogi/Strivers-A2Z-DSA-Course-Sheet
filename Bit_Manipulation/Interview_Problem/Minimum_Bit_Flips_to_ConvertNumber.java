package Interview_Problem;

public class Minimum_Bit_Flips_to_ConvertNumber {
    public int minBitFlips(int start, int goal) {
        int xor=(start^goal);
        int count=0;
        while(xor!=0){
            count+=(xor&1);
            xor=xor>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Minimum_Bit_Flips_to_ConvertNumber obj=new Minimum_Bit_Flips_to_ConvertNumber();
        int start=10;
        int goal=7;
        System.out.println(obj.minBitFlips(start, goal));
    }
}
