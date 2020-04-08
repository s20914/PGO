import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {


    public int Add(int a, int b){
        return a + b;
    }

    public static BigDecimal multiply(ArrayList<BigDecimal> listBigDecimal){
        BigDecimal x = new BigDecimal(1);
        for (int i = 0; i < listBigDecimal.size(); i++) {
            x = x.add(listBigDecimal.get(i));
        }
        return x;
    }
}

