import java.math.BigDecimal;
import java.util.*;

public class Multiplier {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c, int d) {
        int e = a * b;
        int f = c * d;
        return multiply(e, f);
    }

    public double multiply(double a, double b) {
        return multiply(a, b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return multiply(a, b);
    }

    public int multiply(ArrayList<Integer> list) {
        Integer x = 1;
        for (int i = 0; i < list.size(); i++) {
            x *= list.get(i);
        }
        return x;
    }
}


