package pat.basic;

import java.util.Scanner;

public class P1021 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String s = cin.next();
        char[] cs = s.toCharArray();
        int[] f = new int[10];
        for (char c : cs) {
            f[c - '0']++;
        }
        for (int i = 0; i <= 9; i++) {
            if (f[i] == 0) continue;
            System.out.println(i + ":" + f[i]);
        }
        cin.close();
    }
}
