package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST0655SingleYY_FibBigInteger {
    public static void main(String[] args) {
        BigInteger[] F = new BigInteger[201];
        F[0] = F[1] = BigInteger.ONE;
        for (int i = 2; i < F.length; i++)
            F[i] = F[i - 1].add(F[i - 2]);
        Scanner cin = new Scanner(System.in);
        for (int n = cin.nextInt(); n-- > 0 && cin.hasNext(); ) {
            System.out.print(F[cin.next().length()] + "\n");
        }
    }
}