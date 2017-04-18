/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q14 {
    public void reArrange(int[] xs) {
        int p = 0;
        int q = xs.length - 1;
        while (p <= q) {
            if (xs[p] % 2 == 1) {
                p++;
                continue;
            }

            if (xs[q] % 2 == 0) {
                q--;
                continue;
            }

            int tmp = xs[p];
            xs[p] = xs[q];
            xs[q] = tmp;
            p++;
            q--;
        }
    }
}
