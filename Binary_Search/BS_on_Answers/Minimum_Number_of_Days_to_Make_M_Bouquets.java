package Binary_Search.BS_on_Answers;

public class Minimum_Number_of_Days_to_Make_M_Bouquets {
    //find minimum
    public static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    //find maximum
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    // check validation
    public static boolean bloomDay(int arr[],int day,int m,int k){
        int count=0;
        int NoofB=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                NoofB +=count/k;
                count=0;
            }
        }
        NoofB +=count/k;
        return NoofB>=m;
    }
    //main function 
    public static int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=min(bloomDay);
        int high=max(bloomDay);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(bloomDay(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,10,3,10,2};
        int m=3;
        int k=1;
        System.out.println(minDays(arr,m,k));

    }
}
