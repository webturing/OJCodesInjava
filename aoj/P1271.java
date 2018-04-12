package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1271 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        double r = cin.nextDouble();
        double h = cin.nextDouble();
        double area = Math.PI * r * r * 2 + h * Math.PI * r * 2;
        cout.println(String.format("Area=%.3f", area));
        cin.close();
        cout.close();
    }
}
