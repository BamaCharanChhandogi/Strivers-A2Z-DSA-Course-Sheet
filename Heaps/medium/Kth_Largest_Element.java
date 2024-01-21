import java.util.PriorityQueue;

public class Kth_Largest_Element{
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            if(ans.size()>k){
                ans.poll();
            }
            
        }
        int ans2[]=new int[k];
        for(int j=0;j<k;j++){
            ans2[j]=ans.peek();
            ans.poll();
        }
        return ans2[0];
    }
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(arr, k));
    }
}