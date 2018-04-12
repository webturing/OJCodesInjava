package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1562 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            String ss = cin.nextLine();
            int pos = ss.indexOf(" ");
            String sa = ss.substring(0, pos);
            String sb = ss.substring(pos + 1);
            if (ok(sa) && ok(sb))
                cout.println(String.format("%d + %d = %d", Integer.parseInt(sa), Integer.parseInt(sb), Integer.parseInt(sa) + Integer.parseInt(sb)));
            else {
                if (ok(sa))
                    cout.print(Integer.parseInt(sa));
                else
                    cout.print("?");
                cout.print(" + ");
                if (ok(sb))
                    cout.print(Integer.parseInt(sb));
                else
                    cout.print("?");
                cout.println(" = ?");
            }

        }
        cout.close();
        cin.close();
    }

    private static boolean ok(String s) {
        int n;
        try {
            n = Integer.parseInt(s);
            return n <= 1000 && n >= 1;
        } catch (Exception e) {
            return false;
        }
    }


}
