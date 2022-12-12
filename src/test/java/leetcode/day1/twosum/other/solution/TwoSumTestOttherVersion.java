package leetcode.day1.twosum.other.solution;


import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.day1.twosum.others.solution.Solution;

public class TwoSumTestOttherVersion {

    @Test
    public void validScenario() {
        int[] nums = {2, 9, 11, 15, 7};
        int target = 9;
        Solution solution = new Solution(nums, target);
        Integer[] result = solution.getIndex();
        assertEquals(2, result.length);
        assertArrayEquals(result, new Integer[]{0, 4});
    }

    @Test
    public void emptyNumArr() {
        int[] nums = {};
        int target = 9;
        Solution solution = new Solution(nums, target);
        Integer[] result = solution.getIndex();
        assertNull(result);

    }

    @Test
    public void singleElementNumArr() {
        int[] nums = {};
        int target = 9;
        Solution solution = new Solution(nums, target);
        Integer[] result = solution.getIndex();
        assertNull(result);
    }

    @Test
    public void nullNumArr() {
        int target = 9;
        Solution solution = new Solution(null, target);
        Integer[] result = solution.getIndex();
        assertNull(result);
    }

    @Test
    public void invalidTarget() {
        int target = 19;
        Solution solution = new Solution(new int[]{1,2,4}, target);
        Integer[] result = solution.getIndex();
        assertNull(result);
    }

}
