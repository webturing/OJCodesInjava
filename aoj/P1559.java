package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1559 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(), i = 1; i <= n; i++) {
            cout.println(cin.next().replaceAll("\\D+", ""));
        }
        cout.close();
        cin.close();
    }
}
