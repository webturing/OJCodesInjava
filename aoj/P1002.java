package aoj;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(String.format("%.2f %.2f", x1, x2));
        cin.close();
    }
}
