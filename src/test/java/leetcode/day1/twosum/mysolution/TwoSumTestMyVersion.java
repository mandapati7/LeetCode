package leetcode.day1.twosum.mysolution;


import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTestMyVersion {

    @Test
    public void validScenario() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution(nums, target);
        Integer[] result = solution.getIndex();
        assertEquals(2, result.length);
        assertArrayEquals(result, new Integer[]{0, 1});
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
