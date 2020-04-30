package pat.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class P1013 {
    static Vector<Integer> primers = new Vector<>(Arrays.asList(2, 3, 5, 7));
    static Scanner cin = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter cout = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int m = cin.nextInt();
        int n = cin.nextInt();
        int k = primers.lastElement();
        while (primers.size() < n) {
            k += 2;
            boolean flag = true;
            for (Integer primer : primers) {
                if (primer * primer > k) break;
                if (k % primer == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) primers.add(k);
        }
        StringBuffer buffer = new StringBuffer();
        int j = 0;
        for (int i = m - 1; i <= n - 1; i++) {
            if (j++ % 10 == 0) {
                buffer.append("\n");
            } else {
                buffer.append(" ");
            }
            buffer.append(primers.get(i));
        }
        cout.println(buffer.substring(1));

        cin.close();
        cout.close();
    }
}
