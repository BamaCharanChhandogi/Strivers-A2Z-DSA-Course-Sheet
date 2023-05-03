package SolveProblemsOnArrays.Easy;

public class SecondLargestElementinanArraywithoutsorting {
    public static void main(String[] args) {
        int arr[] = {1,2,43,432,23,122};            //Initialized Value
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }
            else if(SecondLargest<arr[i] && arr[i]!=largest){
                SecondLargest=arr[i];
            }
        }
        //test case
        if(largest==Integer.MIN_VALUE||SecondLargest==Integer.MIN_VALUE){
            System.out.println("-1");
            return;
        }
        System.out.println(SecondLargest);
    }
}
