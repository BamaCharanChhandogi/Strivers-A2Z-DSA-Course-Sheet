package Binary_Search.BS_on_1D_Arrays;

public class Rotation {
    public static int rotation(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return count+1;
            }
            count++;
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(rotation(arr));
    }
}
