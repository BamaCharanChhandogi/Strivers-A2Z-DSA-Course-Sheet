package Solve_Problems_On_Arrays.Easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int m=2;
        // ans
        int icount = 0, zerocount = 0, length = 0,extrai=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && zerocount == m) {
                System.out.println(extrai);
                icount = 1+extrai;
                zerocount = 1;
                extrai=0;
                // if(icount>length){
                // length=icount;
                // }
            } else if (arr[i] == 0 && zerocount != m) {
                zerocount++;
                icount++;
            }
            else if(arr[i]==1 && zerocount==m){
                extrai++;
            } else {
                System.out.println(icount);
                icount++;
            }
        }

        if (icount > length) {
            length = icount;
        }
        System.out.println("Max length: " + length);
    }
}
