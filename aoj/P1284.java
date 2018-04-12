package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1284 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        int y = cin.nextInt();

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            cout.println("yes");
        else
            cout.println("no");
        cin.close();
        cout.close();
    }
}
