package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1187 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (; cin.hasNext(); foo(cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt())) ;

        cout.close();
        cin.close();
    }

    private static void foo(int a1, int b1, int a2, int b2) {
        for (int i = 1; ; i++) {
            if (i % a1 == b1 && i % a2 == b2) {
                cout.println(i);
                return;
            }
        }

    }


}
