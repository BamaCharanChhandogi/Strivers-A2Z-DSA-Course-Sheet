package Binary_Search.BS_on_Answers;

public class Kth_element_of_2_sorted_arrays {
    public static int kthelement(int arr1[], int arr2[], int m, int n, int k) {
    if(m > n) {
        return kthelement(arr2, arr1, n, m, k); 
    }
        
    int low = Math.max(0,k-m), high = Math.min(k,n);
        
    while(low <= high) {
        int cut1 = (low + high) >> 1; 
        int cut2 = k - cut1; 
        int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1]; 
        int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
        int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1]; 
        int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2]; 
            
        if(l1 <= r2 && l2 <= r1) {
            return Math.max(l1, l2);
        }
        else if (l1 > r2) {
            high = cut1 - 1;
        }
        else {
            low = cut1 + 1; 
        }
    }
    return -1;
    }
    public static void main(String args[]) {
    int array1[] = {2,3,6,7,9};
    int array2[] = {1,4,8,10};
    int m = array1.length;
    int n = array2.length;
    int k = 5;
    System.out.println("The element at the kth position in the final sorted array is "+kthelement(array1,array2,m,n,k));
    
    }
}
