package aoj;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class P1298 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            BigDecimal a = cin.nextBigDecimal();
            BigDecimal b = cin.nextBigDecimal();
            int c = cin.nextInt();
            cout.println(a.divide(b, c, BigDecimal.ROUND_UP));
        }
        cout.close();
        cin.close();
    }


}
