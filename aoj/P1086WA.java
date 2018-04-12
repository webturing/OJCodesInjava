package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1086WA {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNextLine()) {
            String line = cin.nextLine();
            int pos = line.indexOf("//");
            if (pos < 0)
                cout.println(line);
            else if (pos == 0)
                continue;
            else
                cout.println(line.substring(0, pos));
        }

        cout.close();
        cin.close();
    }
}
