package aoj;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1166 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        while (cin.hasNext()) vector.add(cin.nextInt());
        Vector<Integer> inc = (Vector<Integer>) vector.clone();
        Vector<Integer> dec = (Vector<Integer>) vector.clone();
        Collections.sort(inc);
        Collections.sort(dec, Collections.reverseOrder());
        if (vector.equals(inc) || vector.equals(dec))
            cout.println("YES");
        else
            cout.println("NO");
        cout.close();
        cin.close();
    }
}
