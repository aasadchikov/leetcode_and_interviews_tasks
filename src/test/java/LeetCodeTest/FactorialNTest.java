package LeetCodeTest;

import LeetCode.FactorialN;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialNTest {

    @Test
    public void testFactorialNTest() {

        Assert.assertEquals(FactorialN.factorial(4), 24);
    }
}
