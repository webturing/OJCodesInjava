package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class  P1128{
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        cout.println(cin.nextBigInteger().isProbablePrime(20)?"Y":"N");
        cin.close();
        cout.close();
    }
}
