package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1251 {
    final static int DAYS[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static boolean leap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            String[] ss = cin.next().split("/");
            int year = Integer.parseInt(ss[0]);
            int month = Integer.parseInt(ss[1]);
            int day = Integer.parseInt(ss[2]);
            for (int m = 1; m < month; m++)
                day += DAYS[m];
            if (leap(year) && month > 2)
                day++;
            cout.println(day);

        }

        cin.close();
        cout.close();
    }
}
