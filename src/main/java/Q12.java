/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q12 {
    private void printRecursively(String prefix, int index, int n) {
        if (index == (n - 1)) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 && prefix.equals("")) {
                    continue;
                }
                System.out.printf("%s%d\t", prefix, i);
            }
            System.out.printf("\n");
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 0 && prefix.equals("")) {
                printRecursively(prefix, index + 1, n);
                continue;
            }
            printRecursively(prefix + i, index + 1, n);
        }
    }

    public void print1toN(int n) throws Exception {
        if (n < 1) {
            throw new Exception("invalid input");
        }

        printRecursively("", 0, n);
    }
}
