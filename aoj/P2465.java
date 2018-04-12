package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P2465 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int a = cin.nextInt();
        int b = cin.nextInt();

        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(a + " " + b);

        cout.close();
        cin.close();
    }
}
