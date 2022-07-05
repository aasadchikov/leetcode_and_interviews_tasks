import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testAbbr4() {
        String result = StringUtils.abbreviate("Anton Sadchikov", 4);
        Assert.assertEquals(result, "A...");
    }

    @Test
    public void testAbbr8() {
        String result = StringUtils.abbreviate("Hello world", 8);
        Assert.assertEquals(result, "Hello...");
    }
}
