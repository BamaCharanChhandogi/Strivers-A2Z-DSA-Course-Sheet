package Binary_Search.BS_on_2D_Arrays;

public class Find_Peak_Element_2D_Matrix {
    public static int maxRowElement(int arr[],int end){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rowMax=maxRowElement(mat[mid],mat[mid].length-1);
            //mid is first row
            if(mid==0){
                if(mat[mid][rowMax]>mat[mid+1][rowMax]){
                    return new int[]{mid,rowMax};
                }
            }
            //mid last row
            if(mid==mat.length-1){
                if(mat[mid][rowMax]>mat[mid-1][rowMax]){
                    return new int[]{mid,rowMax};
                }
            }

            if(mat[mid][rowMax]>mat[mid+1][rowMax] && mat[mid][rowMax]>mat[mid-1][rowMax]){
                return new int[]{mid,rowMax};
            }
            else if(mat[mid][rowMax]>mat[mid+1][rowMax]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int a[]=findPeakGrid(matrix);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
