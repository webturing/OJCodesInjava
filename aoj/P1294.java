package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1294 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a[] = new int[cin.nextInt()];
            for (int i = 0; i < a.length; i++)
                a[i] = cin.nextInt();
            int key = cin.nextInt();
            int tot = 0;
            for (int i : a)
                if (i < key) ++tot;
            cout.println(tot);
        }

        cout.close();
        cin.close();
    }


}
