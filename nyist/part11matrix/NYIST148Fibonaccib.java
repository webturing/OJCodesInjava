package nyist.part11matrix;

import java.util.Scanner;
import java.util.Vector;

public class NYIST148Fibonaccib {
    static Vector<Integer> fib = new Vector<Integer>();

    static {
        fib.add(0);
        fib.add(1);
        fib.add(1);
        while (true) {
            int cur = (fib.get(fib.size() - 1) + fib.get(fib.size() - 2)) % 10000;
            int cur2 = (fib.get(fib.size() - 1) + cur) % 10000;
            int idx1 = fib.indexOf(cur);
            int idx2 = fib.indexOf(cur2);
            if (idx1 >= 0 && idx2 >= 0 && idx2 - idx1 == 1) {

                break;
            }
            fib.add(cur);
        }
        // System.out.println(fib);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int m = cin.nextInt();
            if (m == -1)
                break;
            System.out.print(fib.get(m % 15000) + "\n");
        }
    }
}