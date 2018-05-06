package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

public class NYIST0803ADivideB {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            String line = cin.nextLine();
            String[] ss = line.split("\\D+");
            if (line.contains("/")) {
                System.out.print(new BigInteger(ss[0]).divide(new BigInteger(ss[1])));
            } else {
                System.out.print(new BigInteger(ss[0]).mod(new BigInteger(ss[1])));
            }
            System.out.print("\n");
        }
    }
}