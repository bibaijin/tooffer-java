import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q5Test {
    @DataProvider(name = "reversePrint")
    public Object[][] createReversePrintData() {
        return new Object[][]{
                {
                        new Q5(new int[]{1, 2, 3}),
                },
        };
    }

    @Test(dataProvider = "reversePrint")
    public void testReversePrint(Q5 q) {
        q.reversePrint();
    }
}
