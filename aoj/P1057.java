package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1057 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int x = cin.nextInt(), y = cin.nextInt();
        int tot = 0;
        for (int i = x; i <= y; i++) {
            if (i % 3 == 1 && i % 5 == 3) tot += i;
        }
        cout.println(tot);

        cin.close();
        cout.close();
    }
}
