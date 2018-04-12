package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1009 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt(), tot = 0;
            while (n > 0) {
                tot += n % 10;
                n /= 10;
            }
            cout.println(tot);
        }
        cin.close();
        cout.close();
    }
}
