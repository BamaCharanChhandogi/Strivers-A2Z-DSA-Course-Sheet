
import java.util.*;
public class LargestElementInArray {
 
  public static void main(String args[]) {
 
    int arr[] =  {2,5,1,3,0};
    System.out.println("Largest element in the array = " + sort(arr));
  }
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}

