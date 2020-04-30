package pat.basic;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1012 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        Vector<Integer> A1 = new Vector<>();
        Vector<Integer> A2 = new Vector<>();
        Vector<Integer> A3 = new Vector<>();
        Vector<Integer> A4 = new Vector<>();
        Vector<Integer> A5 = new Vector<>();
        int sign = 1;
        while (n-- > 0) {
            int m = cin.nextInt();
            int k = m % 5;
            switch (k) {
                case 0:
                    if (m % 2 == 0)
                        A1.add(m);
                    break;
                case 1:
                    A2.add(m * sign);
                    sign *= -1;
                    break;
                case 2:
                    A3.add(m);
                    break;
                case 3:
                    A4.add(m);
                    break;
                case 4:
                    A5.add(m);
                    break;
            }
        }
        cout.print(A1.isEmpty() ? "N" : A1.stream().reduce(0, Integer::sum));
        cout.print(" ");
        cout.print(A2.isEmpty() ? "N" : A2.stream().reduce(0, Integer::sum));
        cout.print(" ");
        cout.print(A3.isEmpty() ? "N" : A3.size());
        cout.print(" ");
        cout.print(A4.isEmpty() ? "N" : String.format("%.1f", 1.0 * A4.stream().reduce(0, Integer::sum) / A4.size()));
        cout.print(" ");
        cout.print(A5.isEmpty() ? "N" : Collections.max(A5));

        cin.close();
        cout.close();
    }
}
