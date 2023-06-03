package SolveProblemsOnArrays.Medium;

import java.util.*;
public class SetMatrixZeros{
    public static void main(String[] args) {
        // int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        int matrix[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        //ans
        int rowLen=matrix.length;
        int colllen=matrix[0].length;
        //store row and col those are in 0
        List<Integer> row=new ArrayList<>();
        List<Integer> col=new ArrayList<>();
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colllen;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);

                }
            }
        }
        //put 0 in i and j index
        for(int i=0;i<row.size();i++){      //col 0
            for(int j=0;j<colllen;j++){
                matrix[row.get(i)][j]=0;
            }
        }
        for(int i=0;i<col.size();i++){      //row 0
            for(int j=0;j<rowLen;j++){
                matrix[j][col.get(i)]=0;
            }
        }
        //printing ans
        for(int i=0;i<rowLen;i++){      //col 0
            for(int j=0;j<colllen;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}