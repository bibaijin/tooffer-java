/**
 * Created by bibaijin on 14/04/2017.
 */
public class Q4 {
    public char[] replace(char[] cs) {
        int totalLength = 0;
        int spaceLength = 0;
        int i = 0;
        while (cs[i] != '\uFFFF') {
            i++;
            totalLength++;
            if (cs[i] == ' ') {
                spaceLength++;
            }
        }

        int newLength = totalLength + spaceLength * 2;
        int p = totalLength;
        int q = newLength;
        while (p < q) {
            if (cs[p] != ' ') {
                cs[q] = cs[p];
                q--;
            } else {
                cs[q] = '0';
                cs[q - 1] = '2';
                cs[q - 2] = '%';
                q -= 3;
            }

            p--;
        }

        return cs;
    }
}
