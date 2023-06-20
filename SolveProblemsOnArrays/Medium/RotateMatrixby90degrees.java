package SolveProblemsOnArrays.Medium;

public class RotateMatrixby90degrees {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //ans
        //Row-col Interchange
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //again swap n with n-1
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1];
                arr[i][arr.length-1]=temp;
            }
        }
        //printing array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
