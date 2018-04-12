package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1242 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0)
                break;
            cout.println(a + b);
        }
        cin.close();
        cout.close();
    }
}
