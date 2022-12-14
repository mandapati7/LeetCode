package leetcode.day1.twosum.other.solution;


import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTestOtherVersion {

    @Test
    public void validScenario() {
        int[] nums = {2, 9, 11, 15, 7};
        int target = 9;
        Solution solution = new Solution();
        Integer[] result = solution.getIndex(nums, target);
        assertEquals(2, result.length);
        assertArrayEquals(result, new Integer[]{0, 4});
    }

    @Test
    public void emptyNumArr() {
        int[] nums = {};
        int target = 9;
        Solution solution = new Solution();
        Integer[] result = solution.getIndex(nums, target);
        assertNull(result);

    }

    @Test
    public void singleElementNumArr() {
        int[] nums = {};
        int target = 9;
        Solution solution = new Solution();
        Integer[] result = solution.getIndex(nums, target);
        assertNull(result);
    }

    @Test
    public void nullNumArr() {
        int target = 9;
        Solution solution = new Solution();
        Integer[] result = solution.getIndex(null, target);
        assertNull(result);
    }

    @Test
    public void invalidTarget() {
        int target = 19;
        Solution solution = new Solution();
        Integer[] result = solution.getIndex(new int[]{1,2,4}, target);
        assertNull(result);
    }

}
