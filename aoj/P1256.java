package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1256 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {

        for (int cas = cin.nextInt(); cas-- > 0; ) {
            int m = cin.nextInt();
            int s = 0;
            while (m-- > 0) {
                s ^= cin.nextInt();
            }
            cout.println(s);
        }

        cout.close();
        cin.close();
    }
}
