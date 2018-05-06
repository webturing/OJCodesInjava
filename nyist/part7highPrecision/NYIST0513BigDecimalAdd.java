package nyist.part7highPrecision;


/*
 * http://acm.nyist.edu.cn/JudgeOnline/problem.php?pid=513
 * by jtahstu on 2015/3/31 19:00
 */

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
