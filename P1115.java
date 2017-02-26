import java.io.PrintWriter;
import java.util.Scanner;

public class P1115 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        int freq[] = new int[10];
        for (int p = 1; p <= n; ++p) {
            int q = p;
            while (q > 0) {
                freq[q % 10]++;
                q /= 10;
            }
        }
        for (int i : freq)
            cout.println(i);
        cin.close();
        cout.close();
    }
}
