package pat.basic;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1006 {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        StringBuffer buffer = new StringBuffer();
        for (int i = n % 10; i > 0; i--) buffer.append(i);
        for (int i = (n % 100) / 10; i > 0; i--) buffer.append('S');
        for (int i = (n / 100); i > 0; i--) buffer.append('B');
        buffer.reverse();
        cout.println(buffer);


        cin.close();
        cout.close();
    }


}
