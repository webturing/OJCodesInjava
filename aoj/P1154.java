package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1154 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(cin.next().replaceAll("1", "2").replaceAll("0", "1").replaceAll("2", "0"));

        cout.close();
        cin.close();
    }


}