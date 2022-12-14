package leetcode.day1.twosum.optimal.solution;

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

// https://leetcode.com/problems/two-sum/

// import leetcode.day1.twosum.my.solution.Solution;

public class TwoSumOptimalVersion {
    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15, 7};
        int target = 9;
        Solution solution = new Solution();
        Integer[] result = solution.getIndex(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
