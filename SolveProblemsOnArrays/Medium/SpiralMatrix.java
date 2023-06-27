package SolveProblemsOnArrays.Medium;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //ans
        int row=arr.length;
        int col=arr[0].length;
        List<Integer> list =new ArrayList<>();
        //test case
        if(row==0){
            System.out.println(list);
        }
        int direction=0,top=0,bottom=row-1,right=col-1,left=0;
        while((top<=bottom)&&(left<=right)){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    list.add(arr[top][i]);
                }
                direction=1;
                top++;
            }
            else if(direction==1){
                for(int i=top;i<=bottom;i++){
                    list.add(arr[i][right]);
                }
                direction=2;
                right--;
            }
            else if(direction==2){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                direction=3;
                bottom--;
            }
            else if(direction==3){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                direction=0;
                left++;

            }
        }
        System.out.println(list);
    }
}
