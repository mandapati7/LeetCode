package leetcode.day1.twosum.optimal.solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public Integer[] getIndex(int[] nums, int target) {
		if (null == nums || nums.length == 0 || nums.length == 1) {
			return null;
		}

		Map<Integer, Integer> map = new HashMap<>();


		// [1, 2, 3, 4, 5, 6] = 10;
		//  |  |  |  |  |  |

		for (int iIndex = 0; iIndex < nums.length; iIndex++) {
			int findNumber = target - nums[iIndex];
			if (map.containsKey(nums[iIndex])) {
				return new Integer[]{map.get(nums[iIndex]), iIndex};
			} else {
				map.put(findNumber, iIndex);
			}
		}

		return null;
	}

}
