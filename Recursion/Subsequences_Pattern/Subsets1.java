/**
 * The Subsets1 class takes an input of integers, generates all possible subsets of the input,
 * calculates the sum of each subset, and returns a sorted list of the subset sums.
 */
package Recursion.Subsequences_Pattern;
import java.util.*;

public class Subsets1
{
   /**
    * The main function takes input from the user, creates an ArrayList of integers, calculates the
    * subset sums of the ArrayList, sorts the subset sums, and then prints them.
    * 
    * @param args The `args` parameter is an array of strings that represents the command-line
    * arguments passed to the program. In this case, it is not being used in the `main` method.
    */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
         
            ArrayList<Integer> ans = subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();  
    }

    // The `printsubsetsum` method is a recursive function that generates all possible subsets of the
    // input array `arr` and calculates the sum of each subset.
    public static void printsubsetsum(int index,int sum,ArrayList<Integer> arr,ArrayList<Integer> ans){
        if(index==arr.size()){
            ans.add(sum);
            return;
        }
        
        printsubsetsum(index+1,sum+arr.get(index),arr,ans);
        printsubsetsum(index+1,sum,arr,ans);
    }
    /**
     * The function `subsetSums` takes an ArrayList of integers and an integer N as input, and returns
     * an ArrayList of subset sums of the input array in ascending order.
     * 
     * @param arr An ArrayList of integers containing the input array.
     * @param N The parameter N represents the target sum that we want to find subsets for.
     * @return The method is returning an ArrayList of integers.
     */
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        printsubsetsum(0,0,arr,ans);
        Collections.sort(ans);
        return ans;
    }
}