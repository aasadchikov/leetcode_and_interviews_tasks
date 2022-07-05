package InterviewsTasksTest;

import InerviewsTasks.AnagramString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramStringTest {

    @Test
    public void testAnagram1() {

        Assert.assertEquals(AnagramString.isAnagram("Keep", "Peek"), true);

    }

    @Test
    public void testAnagram2() {

        Assert.assertEquals(AnagramString.isAnagram("Mother In Law", "Hitler Woman"), true);

    }

}
