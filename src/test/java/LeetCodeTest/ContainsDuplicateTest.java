package LeetCodeTest;

import LeetCode.ContainsDuplicate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContainsDuplicateTest {

    @Test
    public void testIsContainsDuplicate1() {

        Assert.assertEquals(ContainsDuplicate.IsContainsDuplicate(new int[]{1, 2, 3, 1}), true);

    }

    @Test
    public void testIsContainsDuplicate2() {

        Assert.assertEquals(ContainsDuplicate.IsContainsDuplicate(new int[]{1, 2, 3, 4}), false);

    }

    @Test
    public void testIsContainsDuplicate3() {

        Assert.assertEquals(ContainsDuplicate.IsContainsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}), true);

    }
}
