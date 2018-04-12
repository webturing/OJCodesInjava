package aoj;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P1228 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        BigInteger s = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            s = s.multiply(new BigInteger(Integer.toString(i)));
        cout.println(s);
        cin.close();
        cout.close();
    }
}
