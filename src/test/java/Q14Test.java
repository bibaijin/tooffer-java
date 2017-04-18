import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 16/04/2017.
 */
public class Q14Test {
    @DataProvider(name = "reArrange")
    public Object[][] createReArrangeData() {
        return new Object[][]{
                {
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{1, 5, 3, 4, 2},
                },
        };
    }

    @Test(dataProvider = "reArrange")
    public void testReArrange(int[] in, int[] want) {
        Q14 q = new Q14();
        q.reArrange(in);
        Assert.assertEquals(in, want);
    }
}
