package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1504 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            int d = cin.nextInt() + cin.nextInt() - cin.nextInt();
            if (d >= 0)
                cout.println(d);
            else
                cout.println("Impossible");
        }
        cout.close();
        cin.close();
    }


}