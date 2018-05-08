package nyist.part7highPrecision;

import java.math.BigDecimal;
import java.util.Scanner;

public class NYIST0513BigDecimalAdd {
    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            BigDecimal a = cin.nextBigDecimal();
            BigDecimal b = cin.nextBigDecimal();
            if (a.add(b).compareTo(BigDecimal.ZERO) == 0)
                System.out.print("0");
            else
                System.out.print(a.add(b).stripTrailingZeros().toPlainString());
            System.out.print("\n");
        }
    }
}
