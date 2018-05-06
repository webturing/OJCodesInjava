package nyist.part7highPrecision;

import java.math.BigDecimal;
import java.util.Scanner;

public class NYIST0155BigDecimalPower {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            BigDecimal r = cin.nextBigDecimal();
            int n = cin.nextInt();
            String s=r.pow(n).stripTrailingZeros().toPlainString();
            if(s.startsWith("0."))
                s=s.substring(1);
            System.out.print( s+ "\n");
        }
    }
}