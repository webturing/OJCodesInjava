package pat.basic;


import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1002 {
    static String[] NUMBERS = "ling yi er san si wu liu qi ba jiu".split(" ");
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        char[] chars = cin.next().toCharArray();
        int sum = 0;
        for (char ch : chars) {
            sum += ch - '0';
        }
        Vector<String> vector = new Vector<String>();
        while (sum > 0) {
            vector.add(NUMBERS[sum % 10]);
            sum /= 10;
        }
        Collections.reverse(vector);
        for (int i = 0; i < vector.size(); i++) {
            if (i > 0) cout.print(' ');
            cout.print(vector.get(i));
        }
        cout.println();
        cin.close();
        cout.close();
    }
}
