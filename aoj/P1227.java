package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1227 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            String line = cin.next();
            cout.println(line.length() - line.replaceAll("\\d", "").length());
        }
        cin.close();
        cout.close();
    }
}
