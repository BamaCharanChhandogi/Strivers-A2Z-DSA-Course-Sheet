package SolveProblemsOnArrays.Medium;

import java.util.ArrayList;

public class RearrangeTheArrayInAlternatingPostiveAndNegetiveNumbers {
    public static void main(String[] args) {
        // int n = 9;
        // int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        // example-2
        int n = 10;
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };

        // ans
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr1.add(arr[i]);
            } else {
                arr2.add(arr[i]);
            }
        }
        // put positive and negative in Array
        int P = 0;
        int N = 0;
        int i=0;
        while (i < arr.length) {
            if(P==arr1.size() || N==arr2.size()){
                break;
            }
            else if (i % 2 == 0) {
                arr[i] = arr1.get(P);
                P++;
            } else if(i%2!=0){
                arr[i] = arr2.get(N);
                N++;
            }
           i++; 
        }


        //rest element
        while(P!=arr1.size()){
            arr[i]=arr1.get(P);
            P++;
            i++;
        }
        while(N<arr2.size()){
            arr[i+1]=arr2.get(N);
            N++;
            i++;
        }
       // print ans
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
