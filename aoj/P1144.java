package aoj;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P1144 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int a = cin.nextInt(), b = cin.nextInt();
        for (int n = a; n <= b; n++) {
            String s = Integer.toString(n);
            String rs = new StringBuffer(s).reverse().toString();
            if (s.equals(rs) && new BigInteger(s).isProbablePrime(40))
                cout.println(s);
        }
        cout.close();
        cin.close();
    }


}
