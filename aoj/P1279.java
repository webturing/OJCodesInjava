package aoj;

import java.util.Scanner;

public class P1279 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x1 = cin.nextInt();
        int y1 = cin.nextInt();
        int x2 = cin.nextInt();
        int y2 = cin.nextInt();
        System.out
                .println(String.format("%.3f\n", Math.hypot(x1 - x2, y1 - y2)));
        cin.close();
    }
}
