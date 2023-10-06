package Learn_Bit_Manipulation;

public class odd_Even {
    public static String oddEven(int N){
        // code here
        String ans="";
        int res=1 & N;
        if(res==0){
            ans="even";
        }
        else{
            ans="odd";
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(oddEven(4));
    }
}
