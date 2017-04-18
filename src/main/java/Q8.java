/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q8 {
    public int min(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("empty array");
        }

        if (array[0] < array[array.length - 1]) {
            return array[0];
        }

        int p = 0;
        int q = array.length - 1;
        while (q > p + 1) {
            int m = (p + q) / 2;

            if (array[m] == array[p] && array[m] == array[q]) {
                return minInOrder(array, p, q);
            }

            if (array[m] >= array[p]) {
                p = m;
            } else if (array[m] <= array[q]) {
                q = m;
            }
        }

        return array[q];
    }

    private int minInOrder(int[] array, int p, int q) {
        int minNumber = array[0];
        for (int i = p; i <= q; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }

        return minNumber;
    }
}
