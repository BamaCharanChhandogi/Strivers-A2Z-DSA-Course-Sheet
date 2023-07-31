package Binary_Search.BS_on_Answers;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int merge[] = new int[n+m];
        int i=0;
        for(i=0;i<nums1.length;i++){
            merge[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            merge[i]=nums2[j];
            i++;
        }
        Arrays.sort(merge);

        int mid = merge.length/2;
        double median = 0;
        if(merge.length%2==1){
            median = merge[mid];
        }
        else{
            median = (merge[mid] + merge[mid-1])/2.0;
        }
         return median;
    }
    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]={2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
