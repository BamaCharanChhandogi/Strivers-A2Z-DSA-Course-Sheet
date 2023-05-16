package SolveProblemsOnArrays.Easy;

public class Findthenumberthatappearsonceandothernumberstwice {
    public static void main(String[] args) {
        // int arr[]={1,1,2,3,4,3,4};
        int arr[]={2, 2, 5, 5, 20, 30, 30};
        //ans
        int count=0,length=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<=length){
                length=count;
                ans=i;
            }
            count=0;
        }
        //Print Answer
        System.out.println(arr[ans]);
    }
}
