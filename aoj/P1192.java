package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1192 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a[] = new int[cin.nextInt()];
            for (int i = 0; i < a.length; i++)
                a[i] = cin.nextInt();
            cout.println(max(a));
        }
        cout.close();
        cin.close();
    }

    private static int max(int[] a) {
        int max = 0, sum = 0;
        int cur = a[0];
        for (int i : a) {
            if (i == cur) ++sum;
            else {
                if (sum > max) max = sum;
                sum = 1;
                cur = i;
            }
        }

        return sum > max ? sum : max;
    }


}
