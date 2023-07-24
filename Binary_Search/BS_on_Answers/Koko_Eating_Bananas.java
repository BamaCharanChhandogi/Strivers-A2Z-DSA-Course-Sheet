package Binary_Search.BS_on_Answers;

public class Koko_Eating_Bananas {
    //maximum Number in array
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    // TotalTime
     public static int TotalTimeHour(int arr[],int time){
        int totalhour=0;
        for(int i=0;i<arr.length;i++){
            double a=arr[i];
            double hourly=time;
            totalhour+=Math.ceil(a/hourly);
        }
        return totalhour;
    }
    //main function
    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            int timeHour=TotalTimeHour(piles,mid);
            if(timeHour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(arr,h));
    }
}
