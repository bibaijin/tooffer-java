/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q11 {
    private final double epsilon = 0.0000001d;

    public double power(double base, int exponent) throws Exception {
        if (equal(base, 0.0d) && exponent < 0) {
            throw new Exception("invalid input");
        }

        int absExponent = exponent;
        if (exponent < 0) {
            absExponent = -exponent;
        }

        double result = powerWithPositiveExponent(base, absExponent);

        if (exponent < 0) {
            result = 1.0d / result;
        }

        return result;
    }

    private double powerWithPositiveExponent(double base, int exponent) {
        if (exponent == 0) {
            return 1.0d;
        }

        if (exponent == 1) {
            return base;
        }

        double result = powerWithPositiveExponent(base, exponent >> 1);
        result *= result;

        if ((exponent & 1) != 0) {
            result *= base;
        }

        return result;
    }

    public boolean equal(double x, double y) {
        if ((x - y) > -epsilon && (x - y) < epsilon) {
            return true;
        }

        return false;
    }
}
