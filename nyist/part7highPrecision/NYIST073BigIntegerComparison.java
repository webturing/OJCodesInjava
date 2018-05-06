package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST073BigIntegerComparison {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            if (a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO))
                break;
            int cmp = a.compareTo(b);
            if (cmp < 0)
                System.out.print("a<b");
            else if (cmp > 0)
                System.out.print("a>b");
            else
                System.out.print("a==b");
            System.out.print("\n");
        }
    }
}
