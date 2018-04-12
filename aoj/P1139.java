package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1139 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int cas = cin.nextInt(); cas-- > 0 && cin.hasNext(); ) {
            int a[] = new int[cin.nextInt()];
            for (int i = 0; i < a.length; i++)
                a[i] = cin.nextInt();
            cout.println(foo(a) ? "yes" : "no");
        }
        cout.close();
        cin.close();
    }

    private static boolean foo(int[] a) {
        if (a.length <= 2)
            return true;
        Arrays.sort(a);
        int dt = a[0] - a[1];
        for (int i = 2; i < a.length; i++)
            if (a[i - 1] - a[i] != dt)
                return false;
        return true;
    }


}
