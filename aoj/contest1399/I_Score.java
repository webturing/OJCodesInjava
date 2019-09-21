package aoj.contest1399;

import java.io.PrintWriter;
import java.util.Scanner;

public class I_Score {
    static final char[] RANK = "EEEEEEDCBAA".toCharArray();
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n < 0 || n > 100)
                cout.println("Score is error!");
            else
                cout.println(RANK[n / 10]);
        }

        cin.close();
        cout.close();
    }
}