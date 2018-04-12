package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1526 {
    final static int DAYS[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static boolean leap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public static void main(String[] args) {

        int y = cin.nextInt(), m = cin.nextInt();
        if (leap(y) && m == 2)
            cout.println(29);
        else
            cout.println(DAYS[m]);

        cin.close();
        cout.close();
    }
}
