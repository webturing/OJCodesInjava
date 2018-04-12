package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P2462 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int a = cin.nextInt();
        int b = cin.nextInt();


        System.out.println(a % b);

        cout.close();
        cin.close();
    }
}
