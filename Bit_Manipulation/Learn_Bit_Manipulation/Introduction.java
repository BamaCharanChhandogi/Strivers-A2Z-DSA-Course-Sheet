package Learn_Bit_Manipulation;

// Coding ninja platform solution
public class Introduction {
    public static int[] bitManipulation(int num, int i){
        // Write your code here.
        int arr[] = new int[3];
        int n=num;
        int mask = (1<<i-1);

        arr[0] = ((n >> i-1) & 1);
        if(arr[0]==0){
            arr[1] = (n | mask);
        }
        else{
            arr[1] = num;
        }
        
        if(arr[1]==0){
            arr[2] = num;
        }
        else{
            arr[2] = (n & (~mask));
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = bitManipulation(25, 3);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
