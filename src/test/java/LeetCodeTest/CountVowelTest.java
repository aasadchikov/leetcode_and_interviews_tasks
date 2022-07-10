package LeetCodeTest;

import LeetCode.CountVowel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountVowelTest {

    @Test
    public void testCountVowel() {
        Assert.assertEquals(CountVowel.getVowel("BufferedOutput"), 6);
    }
}
