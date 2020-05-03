package pat.basic;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1009 {


    public static void main(String[] args) {
        String[] words = cin.nextLine().split("\\s+");
        StringBuffer buffer = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            buffer.append(" " + words[i]);
        }
        cout.println(buffer.substring(1));
        cin.close();
        cout.close();
    }

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
}
