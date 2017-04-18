import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q10Test {
    @DataProvider(name = "countOne")
    public Object[][] createCountOneData() {
        return new Object[][]{
                {9, 2},
                {-9, 31},
        };
    }

    @Test(dataProvider = "countOne")
    public void testCountOne(int in, int want) {
        Q10 q = new Q10();
        int got = q.countOne(in);
        Assert.assertEquals(got, want);
    }

    @Test(dataProvider = "countOne")
    public void testCountOne2(int in, int want) {
        Q10 q = new Q10();
        int got = q.countOne2(in);
        Assert.assertEquals(got, want);
    }
}
