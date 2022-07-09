package LeetCodeTest;

import LeetCode.RemoveDuplicates;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {

        Assert.assertEquals(RemoveDuplicates.removeDuplicatesFromSortedArray(new int[]{ 1, 1, 2, 2, 2 }), new int[]{ 1, 2});

    }
}
