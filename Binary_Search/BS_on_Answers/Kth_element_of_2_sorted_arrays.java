package Binary_Search.BS_on_Answers;

public class Kth_element_of_2_sorted_arrays {
    public static long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int i = 0, j = 0, kth = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                kth++;
                if (kth == k) {
                    return arr1[i];
                }
                i++;
            } else {
                kth++;
                if (kth == k) {
                    return arr2[j];
                }
                j++;
            }
        }
        while (i < arr1.length) {
            kth++;
            if (kth == k) {
                return arr1[i];
            }
            i++;
        }
        while (j < arr2.length) {
            kth++;
            if (kth == k) {
                return arr2[j];
            }
            j++;
        }
        return -1;

    }

    public static void main(String args[]) {
        int array1[] = { 2, 3, 6, 7, 9 };
        int array2[] = { 1, 4, 8, 10 };
        int m = array1.length;
        int n = array2.length;
        int k = 5;
        System.out.println(
                "The element at the kth position in the final sorted array is " + kthElement(k, array1, array2));
    }
}
