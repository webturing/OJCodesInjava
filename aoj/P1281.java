package aoj;

import java.util.Scanner;

public class P1281 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float f = cin.nextInt() * 95;
        if (f >= 300) f *= 0.85;
        System.out.println(String.format("%.2f", f));
        cin.close();
    }
}
