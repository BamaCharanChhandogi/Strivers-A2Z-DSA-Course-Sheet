package SolveProblemsOnArrays.Hard;
import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows=5;
        //ans

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                    row.add(ans.get(i-2).get(j)+ans.get(i-2).get(j-1));
                }
            }
            ans.add(row);
        }
        //printing ans
        System.out.println(ans);
    }
}
