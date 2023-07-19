package Binary_Search.BS_on_Answers;

public class SquareRootOfANumber {
    public static int SqrtN(long N){
        long low=0;
		 long high=N/2;
		 int ans=1;
		 while(low<=high){
			 long mid=low+(high-low)/2;
			 if(mid*mid<=N){
				 ans=(int) mid;
				 low=mid+1;
			 }
			 else{
				 high=mid-1;
			 }
		 }
		 return ans;
    }
    public static void main(String[] args) {
        long N=6;
        System.out.println(SqrtN(N));
        
    }
}
