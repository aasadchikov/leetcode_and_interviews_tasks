package LeetCodeTest;

import LeetCode.DescendingOrder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DescendingOrderTest {

    @Test
    public void testDescendingOrder() {

        Assert.assertEquals(DescendingOrder.sortDec(new Integer[]{ 1, 2, 3, 4, 5 }), new Integer[]{ 5, 4, 3, 2, 1 });

    }
}
