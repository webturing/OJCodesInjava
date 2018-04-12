package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1203 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            for (String s : cin.nextLine().trim().split("\\W+"))
                cout.println(s);
        }
        cout.close();
        cin.close();
    }


}
