import java.io.PrintWriter;
import java.util.Scanner;

public class P1113 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            if (n == 0 && m == 0)
                break;
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++)
                a[i] = cin.nextInt();
            int i;
            for (i = 0; i < n && a[i] <= m; i++)
                cout.print(a[i] + " ");
            cout.print(m);
            for (; i < n; i++)
                cout.print(" " + a[i]);
            cout.println();
        }
        cout.close();
        cin.close();
    }


}
