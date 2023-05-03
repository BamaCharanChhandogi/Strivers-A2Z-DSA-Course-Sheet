package SolveProblemsOnArrays.Easy;

public class Checkifthearrayissorted {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 412, 13, 2 };
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                flag=false;
                return;
            }
        }
        if(flag==true){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

}
