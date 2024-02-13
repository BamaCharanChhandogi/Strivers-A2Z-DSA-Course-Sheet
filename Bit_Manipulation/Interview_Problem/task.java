package Interview_Problem;

public class Single_Number {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Single_Number obj=new Single_Number();
        int[] nums={4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }
}
