package Binary_Search.BS_on_Answers;

public class FindNthRootOfM {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=0;
        int high=m/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Math.pow(mid, n)==m){
                return mid;
            }
            else if(Math.pow(mid, n)<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3;
        int m=27;
        System.out.println(NthRoot(n,m));
    }
}
