package Binary_Search.BS_on_Answers;

public class Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                break;
            }
            else{
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
    int arr[]={2,3,4,7,11};
    int k=5;
        System.out.println(findKthPositive(arr,k));
    }
}
