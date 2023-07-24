package Binary_Search.BS_on_Answers;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static boolean findMain(int arr[],int mid,int threshold){
        int ceil=0;
        for(int i=0;i<arr.length;i++){
            double a=mid;
            double b=arr[i];
            ceil+=Math.ceil(b/a);
        }

        if(ceil>threshold){
            return false;
        }
        return true;
    }
    public static  int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int num : nums) high = Math.max(num,high);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(findMain(nums,mid,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int arr[]={44,22,33,11,1};
        int k=5;
        System.out.println(smallestDivisor(arr,k));
    }
}
