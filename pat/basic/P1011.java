package pat.basic;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P1011 {


    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int T = cin.nextInt();
        for (int cas = 1; cas <= T; ++cas) {
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            BigInteger c = cin.nextBigInteger();
            cout.println(String.format("Case #%d: %s", cas, a.add(b).compareTo(c) > 0));
        }
        cin.close();
        cout.close();
    }
}
