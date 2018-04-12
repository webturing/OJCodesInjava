package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1033 {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int s = 0, i;
            for (i = 1; ; i++) {
                s += i * i * i;
                if (s > n)
                    break;
            }
            cout.println(i-1);
        }

        cin.close();
        cout.close();
    }
}
