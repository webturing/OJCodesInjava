package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST0517LCM {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger[] b = new BigInteger[101];
        b[1] = BigInteger.ONE;
        for (int i = 2; i < b.length; i++) {
            BigInteger cur = new BigInteger(String.valueOf(i));
            b[i] = cur.multiply(b[i - 1]).divide(cur.gcd(b[i - 1]));
        }
        while (cin.hasNext())
            System.out.print(b[cin.nextInt()] + "\n");

    }
}
