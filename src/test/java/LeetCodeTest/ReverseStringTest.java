package LeetCodeTest;

import LeetCode.ReverseStringSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {

    @Test
    public void testReverseString() {

        Assert.assertEquals(ReverseStringSolution.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}), new char[]{'o', 'l', 'l', 'e', 'h'});

    }
}

