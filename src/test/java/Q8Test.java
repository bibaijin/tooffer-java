import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q8Test {
    @DataProvider(name = "min")
    public Object[][] createMinData() {
        return new Object[][]{
                {
                        new int[]{3, 4, 5, 1, 2},
                        1,
                },
                {
                        new int[]{1, 2, 3, 4, 5},
                        1,
                },
                {
                        new int[]{1, 0, 1, 1, 1},
                        0,
                },
                {
                        new int[]{1, 1, 1, 0, 1},
                        0,
                },
        };
    }

    @Test(dataProvider = "min")
    public void testMin(int[] in, int want) throws Exception {
        Q8 q = new Q8();
        int got = q.min(in);
        Assert.assertEquals(got, want);
    }
}
