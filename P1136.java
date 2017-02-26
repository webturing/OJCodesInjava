import java.io.PrintWriter;
import java.util.Scanner;

public class P1136 {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int N = cin.nextInt();
        int a[][] = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = cin.nextInt();
        for (int j = 0; j < N; j++) {
            cout.print(a[N - 1][j]);
            for (int i = N - 2; i >= 0; i--)
                cout.print(" " + a[i][j]);
            cout.println();
        }

        cin.close();
        cout.close();
    }
}
