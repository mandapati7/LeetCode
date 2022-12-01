package leetcode.day1;


import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTestMyVersion {

    @Test
    public void validScenario() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution(nums, target);
        int[] result = solution.getIndex();
        assertEquals(2, result.length);
        assertArrayEquals(result, new int[]{0, 1});
    }

    @Test
    public void emptyNumArr() {
        int[] nums = {};
        int target = 9;
        Solution solution = new Solution(nums, target);
        int[] result = solution.getIndex();
        assertEquals(1, result.length);
        assertArrayEquals(result, new int[]{-1});
    }

    @Test
    public void singleElementNumArr() {
        int[] nums = {};
        int target = 9;
        Solution solution = new Solution(nums, target);
        int[] result = solution.getIndex();
        assertEquals(1, result.length);
        assertArrayEquals(result, new int[]{-1});
    }

    @Test
    public void nullNumArr() {
        int target = 9;
        Solution solution = new Solution(null, target);
        int[] result = solution.getIndex();
        assertEquals(1, result.length);
        assertArrayEquals(result, new int[]{-1});
    }

}
