import java.io.PrintWriter;
import java.util.Scanner;

public class P1288 {


    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static int factorial[] = new int[26];

    static {
        factorial[0] =0;
        factorial[1] = 1;
        for (int i = 2; i < factorial.length; i++)
            factorial[i] = factorial[i - 1] * i % 1000000;
        for (int i = 1; i < factorial.length; i++)
            factorial[i] = (factorial[i] + factorial[i - 1]) % 1000000;
    }

    public static void main(String[] args) {
        cout.println(factorial[cin.nextInt()]);
        cout.close();
        cin.close();
    }


}