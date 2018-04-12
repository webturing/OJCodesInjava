package aoj;

import java.util.Scanner;

public class P1094 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int N = cin.nextInt(); N-- > 0; ) {
            double r = cin.nextDouble();
            System.out.println(String.format("%.6f", Math.PI * r * r));
        }
        cin.close();
    }
}
