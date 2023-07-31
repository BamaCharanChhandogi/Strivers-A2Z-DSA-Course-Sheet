package Binary_Search.BS_on_2D_Arrays;

import java.util.ArrayList;

public class Row_with_max_1s {
     public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int count=0,ans=-1,maxLength=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==1){
                    // System.out.println(matrix.get(i).get(j));
                    count++;
                }
            }
            if(count>maxLength){
                maxLength=count;
                ans=i;
            }
            count=0;
        }
        if(ans<0){
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();
        int n=3,m=3;

        // Add rows to the 2D ArrayList
        twoDArrayList.add(new ArrayList<>()); // Row 0
        twoDArrayList.add(new ArrayList<>()); // Row 1
        twoDArrayList.add(new ArrayList<>()); // Row 2

        // Add elements to the 2D ArrayList
        twoDArrayList.get(0).add(1); // Row 0, Column 0
        twoDArrayList.get(0).add(1); // Row 0, Column 1
        twoDArrayList.get(0).add(1); // Row 0, Column 2

        twoDArrayList.get(1).add(0); // Row 1, Column 0
        twoDArrayList.get(1).add(0); // Row 1, Column 1
        twoDArrayList.get(1).add(1); // Row 1, Column 2

        twoDArrayList.get(2).add(0); // Row 2, Column 0
        twoDArrayList.get(2).add(0); // Row 2, Column 1
        twoDArrayList.get(2).add(0); // Row 2, Column 2
        System.out.println(maximumOnesRow(twoDArrayList,n,m));
    }
}
