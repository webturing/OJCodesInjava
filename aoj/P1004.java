package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1004 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int a[] = {cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt()};
        perm(a[0],a[1],a[2]);
        perm(a[0],a[1],a[3]);
        perm(a[0],a[2],a[3]);
        perm(a[1],a[2],a[3]);
        cout.close();
        cin.close();
    }

    private static void perm(int a, int b, int c) {
        cout.println(String.format("%d %d %d",a,b,c));
        cout.println(String.format("%d %d %d",a,c,b));
        cout.println(String.format("%d %d %d",b,a,c));
        cout.println(String.format("%d %d %d",b,c,a));
        cout.println(String.format("%d %d %d",c,a,b));
        cout.println(String.format("%d %d %d",c,b,a));
    }
}
