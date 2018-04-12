package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1083 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int cur = cin.nextInt();
            cout.print(cur + "-->");
            if (cur < 0) {
                cout.print("-");
                cur = -cur;
            }
            cout.println(Integer.toBinaryString(cur));
        }
        cout.close();
        cin.close();
    }
}
