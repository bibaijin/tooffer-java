import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q9Test {
    @DataProvider(name = "fab")
    public Object[][] createFabData() {
        return new Object[][]{
                {0, 0,},
                {1, 1,},
                {2, 1,},
                {3, 2,},
                {4, 3,},
                {5, 5,},
                {6, 8,},
                {7, 13,},
                {8, 21,},
        };
    }

    @Test(dataProvider = "fab")
    public void testFab(int in, int want) {
        Q9 q = new Q9();
        int got = q.fab(in);
        Assert.assertEquals(got, want);
    }
}
