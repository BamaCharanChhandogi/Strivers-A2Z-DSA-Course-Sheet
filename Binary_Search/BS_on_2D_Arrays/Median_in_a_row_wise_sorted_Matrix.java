package Binary_Search.BS_on_2D_Arrays;

import java.util.Arrays;

public class Median_in_a_row_wise_sorted_Matrix {
    public static int median(int matrix[][], int R, int C) {
        // code here
        int totalelement=R*C;
        int Temp1DArray[]=new int[totalelement];
        int index=0;
        for(int row[]:matrix){
            for(int ele:row){
                Temp1DArray[index++]=ele;
            }
        }
        
        Arrays.sort(Temp1DArray);
        if((Temp1DArray.length)%2==1){
            return Temp1DArray[totalelement/2];
        }
        int mid=totalelement/2;
        return (Temp1DArray[mid-1]+Temp1DArray[mid])/2;
        
        
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        int m=3,n=3;
        System.out.println(median(matrix,m,n));
    }
}
