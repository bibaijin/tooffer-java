import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by bibaijin on 14/04/2017.
 */
public class Q4Test {
    @DataProvider(name = "replace")
    public Object[][] createReplaceData() {
        return new Object[][]{
                {
                        new char[]{'W', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y', '.', '\uFFFF',
                                '\uFFFF', '\uFFFF', '\uFFFF', '\uFFFF'},
                        new char[]{'W', 'e', '%', '2', '0', 'a', 'r', 'e', '%', '2', '0', 'h', 'a', 'p', 'p', 'y', '.',
                                '\uFFFF'},
                },
        };
    }

    @Test(dataProvider = "replace")
    public void testReplace(char[] in, char[] want) {
        Q4 q = new Q4();
        char[] got = q.replace(in);
        Assert.assertTrue(Arrays.equals(got, want));
    }
}
