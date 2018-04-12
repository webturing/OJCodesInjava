package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1547 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(cin.nextBigInteger().add(cin.nextBigInteger()));
        cout.close();
        cin.close();
    }


}
