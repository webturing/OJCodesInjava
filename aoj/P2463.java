package aoj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P2463 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        DecimalFormat fmt = new DecimalFormat(".000");
        System.out.println(fmt.format(area));
        cin.close();
    }

}