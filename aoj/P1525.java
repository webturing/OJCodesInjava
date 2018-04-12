package aoj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1525 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double H = cin.nextDouble();
        double R = cin.nextDouble();
        double r = cin.nextDouble();
        double h = cin.nextDouble();
        R = r + (R - r) * h / H;
        double V = 1.0 / 3 * Math.PI * h * (R * R + r * r + r * R);
        DecimalFormat fmt = new DecimalFormat(".00");
        System.out.println(fmt.format(V));
        cin.close();
    }
}