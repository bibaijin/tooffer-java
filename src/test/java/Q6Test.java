import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q6Test {
    @DataProvider(name = "buildBinaryTree")
    public Object[][] createBuildBinaryTreeData() {
        return new Object[][]{
                {
                        new int[]{1, 2, 4, 7, 3, 5, 6, 8},
                        new int[]{4, 7, 2, 1, 5, 3, 8, 6},
                }
        };
    }

    @Test(dataProvider = "buildBinaryTree")
    public void testBuildBinaryTree(int[] ps, int[] ms) {
        Q6 q = new Q6(ps, ms);
        Q6.BinaryTreeNode t = q.buildBinaryTree();
        Assert.assertEquals(t.preOrder().toArray(), ps);
        Assert.assertEquals(t.inOrder().toArray(), ms);
        Assert.assertEquals(t.value, 1);
    }
}
