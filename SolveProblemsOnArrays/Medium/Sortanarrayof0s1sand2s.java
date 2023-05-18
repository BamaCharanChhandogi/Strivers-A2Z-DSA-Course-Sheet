package SolveProblemsOnArrays.Medium;

public class Sortanarrayof0s1sand2s {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        //ans
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
            switch (arr[mid]) {
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                     temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
