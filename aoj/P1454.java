package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1454 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(f(cin.nextInt()));
        cout.close();
        cin.close();
    }

    private static int f(int n) {
        return n < 10 ? n : f(n / 10) + n % 10;
    }

}