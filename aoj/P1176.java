package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1176 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int tot = 0;
        while (cin.hasNext()) {
            String tel = cin.next();
            if (ok(tel)) {
                cout.println(tel);
                ++tot;
            }
        }
        cout.println(tot);
        cout.close();
        cin.close();
    }

    private static boolean ok(String tel) {
        int six = tel.length() - tel.replaceAll("6", "").length();
        int eight = tel.length() - tel.replaceAll("8", "").length();
        return !tel.contains("4") && six + eight >= 5;
    }


}