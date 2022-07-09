package LeetCodeTest;

import LeetCode.TwoSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        Assert.assertEquals(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }

    @Test
    public void testTwoSumTwoPassHashTable() {
        Assert.assertEquals(TwoSum.twoSumTwoPassHashTable(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }

    @Test
    public void testTwoSumOnePassHashTable() {
        Assert.assertEquals(TwoSum.twoSumOnePassHashTable(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }
}
