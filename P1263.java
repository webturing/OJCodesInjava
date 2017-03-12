import java.io.PrintWriter;
import java.util.Scanner;

public class P1263 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            cout.println(Integer.parseInt(
                    new StringBuffer(
                            Integer.toBinaryString(cin.nextInt()
                            )
                    ).reverse().toString(), 2));
        }
        cout.close();
        cin.close();
    }


}
