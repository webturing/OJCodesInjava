package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1245 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            cout.println(cin.nextInt() + cin.nextInt());
            cout.println();
        }
        cin.close();
        cout.close();
    }
}
