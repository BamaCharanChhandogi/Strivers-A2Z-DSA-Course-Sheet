package SolveProblemsOnArrays.Medium;
public class StockBuyandSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        //ans
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]-min>profit){
                profit=arr[i]-min;
            }
        }

        //print 
        System.out.println("maximum profit: "+profit);
    }
}
