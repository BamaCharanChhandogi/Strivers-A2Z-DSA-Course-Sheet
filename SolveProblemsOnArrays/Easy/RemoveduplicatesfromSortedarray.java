package SolveProblemsOnArrays.Easy;

public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
        //we Use Two Pointer Concept
        int arr[]={2,2,2,1,4};
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[++i]=arr[j];
            }
        }
        for(int k=0;k<i+1;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
