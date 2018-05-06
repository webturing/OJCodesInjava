package nyist.part7highPrecision;

import java.util.Scanner;

public class NYIST524BigDecimalSub {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); )
            System.out.print(cin.nextBigDecimal().compareTo(cin.nextBigDecimal()) == 0 ? "YES\n" : "NO\n");
    }
}