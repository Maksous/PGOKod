import java.math.BigDecimal;

public class Multiplier {

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c, int d){
        return multiply(a,b)*c*d;
    }

    //multiply z dwiema zmiennymi typu double

    BigDecimal multiplay(BigDecimal a, BigDecimal b){
        BigDecimal c = a.multiply(b);
        return c;
    }

}
