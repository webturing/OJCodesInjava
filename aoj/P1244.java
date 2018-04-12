package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1244 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int tot = 0;
            for (int m = cin.nextInt(); m-- > 0;) {
                tot += cin.nextInt();
            }
            cout.println(tot);
        }
        cin.close();
        cout.close();
    }
}
