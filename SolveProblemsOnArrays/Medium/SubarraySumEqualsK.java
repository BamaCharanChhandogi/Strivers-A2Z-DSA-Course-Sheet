package SolveProblemsOnArrays.Medium;
public class SubarraySumEqualsK{
    public static void main(String[] args) {
        int arr[]={1,1,1};
        // int arr[]={1,2,3};
        int k=2;
        //ans
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    ans++;
                }
            }
        }
        //printing ans
        System.out.println("Total SubArray: "+ans);
    }
}