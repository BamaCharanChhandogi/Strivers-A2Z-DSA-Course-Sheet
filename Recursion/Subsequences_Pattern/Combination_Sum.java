package Recursion.Subsequences_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void checksum(List<List<Integer>> ans, int arr[], int target, int index, int N, int sum, List<Integer> temp) {
        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (sum > target || index >= N) {
            return;
        }

        temp.add(arr[index]);
        checksum(ans, arr, target, index, N, sum + arr[index], temp);

        temp.remove(temp.size() - 1);
        checksum(ans, arr, target, index + 1, N, sum, temp);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        checksum(ans, candidates, target, 0, candidates.length, 0, new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        System.out.println(combinationSum(arr,7));
    }
}
