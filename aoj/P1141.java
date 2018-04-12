package aoj;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class P1141 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) break;
            TreeSet<Integer> set = new TreeSet<Integer>();
            for (int i = 0; i < n; i++) set.add(cin.nextInt());
            cout.println(set.size());
            boolean first = true;
            for (int i : set) {
                if (first)
                    first = false;
                else
                    cout.print(" ");
                cout.print(i);
            }
            cout.println("\n");
        }

        cout.close();
        cin.close();
    }


}
