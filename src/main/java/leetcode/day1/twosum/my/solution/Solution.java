package leetcode.day1.twosum.my.solution;

class Solution {
	Integer[] getIndex(int[] nums, int target) {
		Integer answer[] = new Integer[2];

		if (null == nums || nums.length == 0 || nums.length == 1) {
			return null;
		}

		for (int aIndex = 0; aIndex < nums.length; aIndex++) {
			for (int bIndex = 1; bIndex < nums.length; bIndex++) {
				if (nums[aIndex] + nums[bIndex] == target) {
					answer[0] = aIndex;
					answer[1] = bIndex;
					return answer;
				}
			}
		}
		return null;
	}

}
