package leetcode.day1.twosum.other.solution;

public class Solution {

	public Integer[] getIndex(int[] nums, int target) {
		if (null == nums || nums.length == 0 || nums.length == 1) {
			return null;
		}

		Integer answer[] = new Integer[2];

		// [1, 2, 3, 4, 5, 6] = 10;
		//  |  |  |  |  |  |

		for (int iIndex = 0; iIndex < nums.length; iIndex++) {
			int findNumber = target - nums[iIndex];
			for (int jIndex = iIndex + 1; jIndex < nums.length; jIndex++) {
				if(findNumber == nums[jIndex]) {
					answer[0] = iIndex;
					answer[1] = jIndex;
					return answer;
				}
			}
		}

		return null;
	}

}
