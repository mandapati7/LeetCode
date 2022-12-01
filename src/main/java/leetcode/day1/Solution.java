package leetcode.day1;

class Solution {
	private int[] nums;
	private int target;

	public Solution(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
	}

	int[] getIndex() {
		int answer[] = new int[2];
		boolean foundIndex = false;

		if (null == nums || nums.length == 0 || nums.length == 1) {
			return new int[] { -1 };
		}

		for (int aIndex = 0; aIndex < nums.length; aIndex++) {
			for (int bIndex = 1; bIndex < nums.length; bIndex++) {
				if (nums[aIndex] + nums[bIndex] == target) {
					answer[0] = aIndex;
					answer[1] = bIndex;
					foundIndex = true;
					break;
				}
			}
			if (foundIndex)
				break;
		}
		return answer;
	}

}
