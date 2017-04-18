import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q11Test {
    @DataProvider(name = "power")
    public Object[][] createPowerData() {
        return new Object[][]{
                {2.0d, 3, 8.0d},
                {0.0d, 3, 0.0d},
                {0.0d, 0, 1.0d},
                {3.0d, 0, 1.0d},
                {2.0d, -1, 0.5d},
        };
    }

    @Test(dataProvider = "power")
    public void testPower(double base, int exponent, double want) throws Exception {
        Q11 q = new Q11();
        double got = q.power(base, exponent);
        Assert.assertTrue(q.equal(got, want));
    }
}
