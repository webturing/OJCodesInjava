import java.io.PrintWriter;
import java.util.Scanner;

public class P2129 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static void foo(int[] arr) {

        int pos = 0;
        int tot = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tot += arr[i];
            if (arr[i] > arr[pos]) pos = i;
        }
        arr[pos] = tot;
    }


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            int[][] A = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) {
                    A[i][j] = cin.nextInt();
                }
            for (int i = 0; i < m; i++)
                foo(A[i]);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n-1; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println(A[i][n-1]);
            }
        }

        cout.close();
        cin.close();
    }
}
