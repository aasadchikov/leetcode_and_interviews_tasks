package LeetCodeTest;

import LeetCode.HighestLowestNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HighestLowestNumberTest {

    @Test
    public void testGetHighestLowestNumber() {
        Assert.assertEquals(HighestLowestNumber.getHighestLowestNumber("55,32,45,98,82,11,9,39,50"), "98,9");
    }
}
