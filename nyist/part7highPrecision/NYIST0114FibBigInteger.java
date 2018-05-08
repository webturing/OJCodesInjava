package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST0114FibBigInteger {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger[] b = new BigInteger[100];
        while (cin.hasNext()) {
            b[0] = cin.nextBigInteger();
            b[1] = cin.nextBigInteger();
            b[2] = cin.nextBigInteger();
            for (int i = 3; i <= 99; i++)
                b[i] = b[i - 1].add(b[i - 2]).add(b[i - 3]);
            System.out.print(b[99] + "\n");
        }
        cin.close();
    }
}