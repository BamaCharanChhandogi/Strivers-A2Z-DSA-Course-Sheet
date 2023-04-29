package LearnImportantSortingTechniques.Sorting1;

public class Bubble {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};          // Initialized Array
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // print sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
