package Binary_Search.BS_on_2D_Arrays;

public class Search_a_2D_Matrix_1 {
    public static boolean searchMatrix(int[][] mat, int X) {
        int N = mat.length;
        int M = mat[0].length;
      int low  = 0;
      int end = (N*M)-1;
      while(low<=end){
          int mid = low+(end-low)/2;
          if(mat[mid/M][mid%M]==X){
              return true;
          }
          else if(mat[mid/M][mid%M]>X){
              end = mid-1;
          }
          else{
              low = mid+1;
          }
      }
      return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix,target));
    }
}
