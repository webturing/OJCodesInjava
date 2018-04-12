package aoj;

import java.util.Scanner;

public class P1278 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double r = n / 180.0 * Math.PI;
        System.out.println(String.format("%.3f %.3f", Math.sin(r), Math.cos(r)));
        cin.close();
    }
}
