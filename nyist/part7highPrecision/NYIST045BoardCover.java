package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST045BoardCover {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        while (m-- > 0) {
            int k = cin.nextInt();
            BigInteger s = new BigInteger("2").pow(2 * k).subtract(BigInteger.ONE).divide(new BigInteger("3"));
            System.out.print(s + "\n");
        }
        cin.close();
    }
}
