package InterviewsTasksTest;

import InerviewsTasks.CountString;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

public class CountStringTest {

    @Test
    public void test() {

        List<String> strings = Arrays.asList("appLe","b at","APPle","car!","truck!","tr UcK2");

        Map<String,Integer> expecteds = new HashMap<>();
        expecteds.put("apple", 2);
        expecteds.put("bat", 1);
        expecteds.put("car", 1);
        expecteds.put("truck", 2);

        Map<String,Integer> output = CountString.countStrings(strings);
        Assert.assertEquals(expecteds, output);



    }
}
