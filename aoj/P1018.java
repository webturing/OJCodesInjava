package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1018 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int a = cin.nextInt();
        cout.print(String.format("%d*%d*%d=%d=%d", a, a, a, a * a * a, a * a - a + 1));
        int s = a * a - a + 3;
        for (int i = 1; i < a; i++) {
            cout.print("+" + s);
            s += 2;
        }
        cout.println();
        cout.close();
        cin.close();
    }


}
