package aoj;

import java.util.Scanner;

public class P1063 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int x1 = cin.nextInt();
            int y1 = cin.nextInt();
            int x2 = cin.nextInt();
            int y2 = cin.nextInt();
            System.out.println(String.format("%.2f\n",
                    Math.hypot(x1 - x2, y1 - y2)));

        }
        cin.close();
    }
}
