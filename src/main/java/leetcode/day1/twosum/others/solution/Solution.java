package leetcode.day1.twosum.others.solution;

public class Solution {
	private int[] nums;
	private int target;

	public Solution(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
	}

	public Integer[] getIndex() {
		Integer answer[] = new Integer[2];
		boolean foundIndex = false;

		if (null == nums || nums.length == 0 || nums.length == 1) {
			return null;
		}

		// [1, 2, 3, 4, 5, 6] = 10;
		//  |  |  |  |  |  |

		for (int iIndex = 0; iIndex < nums.length; iIndex++) {
			int findNumber = target - nums[iIndex];

			for (int jIndex = iIndex + 1; jIndex < nums.length; jIndex++) {
			
				if(findNumber == nums[jIndex]) {
					foundIndex = true;
					answer[0] = iIndex;
					answer[1] = jIndex;
				}
				
				if (foundIndex)
					break;
			}
		}

		
		return foundIndex ? answer : null;
	}

}
