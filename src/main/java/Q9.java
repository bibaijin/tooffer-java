/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q9 {
    public int fab(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int p = 0;
        int q = 1;
        for (int i = 0; i < n - 1; i++) {
            int tmp = p;
            p = q;
            q += tmp;
        }

        return q;
    }
}
