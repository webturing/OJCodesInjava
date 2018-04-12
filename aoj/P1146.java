package aoj;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1146 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static Vector<Long> cubes = new Vector<Long>();

    static {
        for (int i = 0; 1L * i * i * i <= Integer.MAX_VALUE; i++)
            cubes.add(1L * i * i * i);
        System.out.println(cubes);
    }

    public static void main(String[] args) {
        int tot = 0;
        while (cin.hasNext()) {
            long cur = cin.nextLong();
            if (cur == 0L) break;
            if (Collections.binarySearch(cubes, cur) > 0)
                ++tot;
        }
        cout.println(tot);
        cout.close();
        cin.close();
    }


}