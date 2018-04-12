package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1560 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int m = cin.nextInt();
            if (m == 0)
                cout.println(0);
            else if (m % 9 == 0) cout.println(9);
            else
                cout.println(m % 9);
        }
        cin.close();
        cout.close();
    }
}
