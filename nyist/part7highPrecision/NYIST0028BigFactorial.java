package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 大数阶乘 Java BigInteger水过
 */
public class NYIST0028BigFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        BigInteger prd = BigInteger.ONE;
        for (int i = 2; i <= m; i++)
            prd = prd.multiply(new BigInteger(Integer.toString(i)));
        System.out.print(prd);
        in.close();
    }
}
