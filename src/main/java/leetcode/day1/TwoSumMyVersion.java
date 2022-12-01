package leetcode.day1;

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

// https://leetcode.com/problems/two-sum/

public class TwoSumMyVersion {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		Solution solution = new Solution(nums, target);
		Integer[] result = solution.getIndex();

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
