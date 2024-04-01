import java.util.HashMap;

import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> nextGreater = new HashMap<>();
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                nextGreater.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.getOrDefault(nums1[i], -1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        
        int[] result = solution.nextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements for nums1:");
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i] + " -> " + result[i]);
        }
    }
}
