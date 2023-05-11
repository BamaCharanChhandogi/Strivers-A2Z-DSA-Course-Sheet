package SolveProblemsOnArrays.Easy;

import java.util.*;

public class UnionofTwoSortedArrays {
    public static void main(String[] args) {
        // int arr[]={1,2,3};
        // int arr2[]={1,2,3,4,5};
        int arr[] = { 2, 2, 3, 4, 5 };
        int arr2[] = { 1, 1, 2, 3, 4 };

        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] == arr2[j]) {
                if (ans.size() > 0 && ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                } else if(ans.size() == 0) {
                    ans.add(arr[i]);
                }
                i++;
                j++;
            } else if (arr[i] < arr2[j]) {
                if (ans.size() > 0 && ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                } else if(ans.size() == 0){
                    ans.add(arr[i]);
                }
                i++;
            } else {
                if (ans.size() > 0 && ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                } else if(ans.size() == 0){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        // rest element
        while (i < arr.length) {
            if (ans.size() > 0 && ans.get(ans.size() - 1) != arr[i]) {
                ans.add(arr[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (ans.size() > 0 && ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        System.out.println(ans);
    }
}
