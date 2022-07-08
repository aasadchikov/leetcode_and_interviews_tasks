package LeetCodeTest;

import LeetCode.FirstUniqCharIndex;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqCharIndexTest {

    @Test
    public void testFirstUniqChar1() {
        Assert.assertEquals(FirstUniqCharIndex.firstUniqChar("leetcode"), 0);
    }

    @Test
    public void testFirstUniqChar2() {
        Assert.assertEquals(FirstUniqCharIndex.firstUniqChar("loveleetcode"), 2);
    }

    @Test
    public void testFirstUniqChar3() {
        Assert.assertEquals(FirstUniqCharIndex.firstUniqChar("aabb"), -1);
    }
}
