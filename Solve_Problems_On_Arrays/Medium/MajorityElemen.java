package Solve_Problems_On_Arrays.Medium;

public class MajorityElemen {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int candidates=0;
        int life=1;
        for(int i=0;i<arr.length;i++){
            if(arr[candidates]==arr[i]){
                life++;
            }
            else{
                life--;
            }

            if(life==0){
                candidates=i;
                life=1;
            }
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[candidates]==arr[i]){
                count++;
            }
        }
        //check
        if(count>arr.length/2){
            System.out.println(arr[candidates]);
        }
    }
}
