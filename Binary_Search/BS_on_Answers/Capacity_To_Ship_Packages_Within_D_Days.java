package Binary_Search.BS_on_Answers;

import java.util.Arrays;

public  class Capacity_To_Ship_Packages_Within_D_Days {
    public static int findDays(int arr[],int day){
        int countDay=1,load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>day){
                countDay++;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return countDay;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int high=Arrays.stream(weights).sum();
        int low=0;
        for(int weight : weights) low = Math.max(weight,low);
        while(low<=high){
            int mid=low+(high-low)/2;
            int Getdays=findDays(weights,mid);
            if(Getdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(arr,days));
    }
}
