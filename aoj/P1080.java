package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1080 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int tot = 0;
        while (cin.hasNext()) {
            String bs = Long.toBinaryString(cin.nextLong());
            while (bs.length() < 32)
                bs = "0" + bs;
            String rs = new StringBuffer(bs).reverse().toString();
            if (bs.equals(rs)) ++tot;
        }
        cout.println(tot);
        cout.close();
        cin.close();
    }
}
