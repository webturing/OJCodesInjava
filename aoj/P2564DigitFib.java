package aoj;

import java.util.Scanner;
import java.util.Vector;

public class P2564DigitFib {
    static Vector<Integer> f = new Vector<Integer>();

    static {
        f.add(0);
        f.add(1);
        for (int i = 3; i <= 60; i++)
            f.add((f.get(f.size() - 1) + f.get(f.size() - 2)) % 10);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long k = cin.nextLong();
            System.out.println(f.get((int) (k % 60)));
        }

    }
}
