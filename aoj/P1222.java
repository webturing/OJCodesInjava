package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1222 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a[] = new int[cin.nextInt()];
            int flag = cin.nextInt();
            for (int i = 0; i < a.length; i++)
                a[i] = cin.nextInt();
            Arrays.sort(a);
            if (flag == 0) {
                for (int i = 0; i < a.length; i++)
                    cout.println(a[i]);

            } else {
                for (int i = a.length - 1; i >= 0; i--)
                    cout.println(a[i]);
            }
        }
        cout.close();
        cin.close();
    }


}
