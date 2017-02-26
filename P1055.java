import java.io.PrintWriter;
import java.util.Scanner;

public class P1055 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) a[i] = cin.nextInt();
        for (int j = 0; j < b.length; j++) b[j] = cin.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (Math.abs(a[i] - b[j]) < min)
                    min = Math.abs(a[i] - b[j]);
        cout.println(min);
        cin.close();
        cout.close();
    }
}
