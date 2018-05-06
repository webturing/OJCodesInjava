package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST103AAddB {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for (int i = 1; i <= T; i++) {
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            System.out.print(String.format("Case %d:\n%s + %s = %s\n", i, a, b, a.add(b)));

        }
        cin.close();
    }
}