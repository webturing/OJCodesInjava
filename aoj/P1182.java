package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1182 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int m = cin.nextInt(); m-- > 0 && cin.hasNext(); ) {
            for (char c : cin.next().toCharArray())
                if (Character.isUpperCase(c))
                    cout.print(Character.toLowerCase(c));
                else cout.print(Character.toUpperCase(c));
            cout.println();
        }
        cin.close();
        cout.close();
    }
}
