import java.io.PrintWriter;
import java.util.Scanner;

public class P1114 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static long f[] = new long[36];

    static {
        f[1] = 3;
        f[2] = 4;
        f[3] = 5;
        for (int i = 4; i < f.length; i++) f[i] = f[i - 1] + f[i - 2] + f[i - 3];
    }


    public static void main(String[] args) {
        for (; cin.hasNext(); cout.println(f[cin.nextInt()])) ;

        cout.close();
        cin.close();
    }


}
