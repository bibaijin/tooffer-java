/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q10 {
    public int countOne(int number) {
        int filter = 1;
        int count = 0;
        while (filter != 0) {
            if ((filter & number) != 0) {
                count++;
            }
            filter = filter << 1;
        }

        return count;
    }

    public int countOne2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }

        return count;
    }
}
