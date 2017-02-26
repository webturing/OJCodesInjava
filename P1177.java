import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P1177 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            BigInteger prd = BigInteger.ONE;
            for (int i = 1, n = cin.nextInt(); i <= n; i++) {
                prd = prd.multiply(new BigInteger(Integer.toString(i)));
            }
            cout.println(prd);

        }
        cin.close();
        cout.close();
    }
}
