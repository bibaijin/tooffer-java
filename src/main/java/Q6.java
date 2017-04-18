import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q6 {
    int[] ps;
    int[] ms;

    public Q6(int[] ps, int[] ms) {
        this.ps = ps;
        this.ms = ms;
    }

    public BinaryTreeNode buildBinaryTree() {
        if (ps.length == 0) {
            return null;
        }

        BinaryTreeNode t = new BinaryTreeNode();
        t.value = ps[0];

        if (ps.length == 1) {
            return t;
        }

        int position = index(this.ms, ps[0]);
        Q6 left = new Q6(Arrays.copyOfRange(ps, 1, position + 1), Arrays.copyOfRange(ms, 0, position));
        Q6 right = new Q6(Arrays.copyOfRange(ps, position + 1, ps.length), Arrays.copyOfRange(ms, position + 1, ms.length));

        t.left = left.buildBinaryTree();
        t.right = right.buildBinaryTree();

        return t;
    }

    private int index(int[] vs, int v) {
        for (int i = 0; i < vs.length; i++) {
            if (vs[i] == v) {
                return i;
            }
        }

        return -1;
    }

    class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public List<Integer> preOrder() {
            List<Integer> xs = new ArrayList<>();

            xs.add(this.value);

            if (this.left != null) {
                xs.addAll(this.left.preOrder());
            }

            if (this.right != null) {
                xs.addAll(this.right.preOrder());
            }

            return xs;
        }

        public List<Integer> inOrder() {
            List<Integer> xs = new ArrayList<>();

            if (this.left != null) {
                xs.addAll(this.left.inOrder());
            }

            xs.add(this.value);

            if (this.right != null) {
                xs.addAll(this.right.inOrder());
            }

            return xs;
        }
    }
}
