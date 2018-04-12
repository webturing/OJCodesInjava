package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1021 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        String str = cin.next();
        cout.println(str.length() - str.replaceAll("[a-zA-Z]", "").length());
        cin.close();
        cout.close();
    }
}
