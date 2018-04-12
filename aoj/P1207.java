package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1207
{
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0)
                break;
            int a = n % 1000 / 100;
            int b = n % 100 / 10;
            int c = n % 10;
            if (n == a * a * a + b * b * b + c * c * c)
                cout.println("Yes");
            else
                cout.println("No");
        }
        cin.close();
        cout.close();
    }
}
