package aoj;

import java.util.Scanner;

public class P1064 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            float r = cin.nextFloat();
            System.out.println(String.format("%.3f", Math.PI * Math.pow(r, 3)
                    * 4 / 3));
        }
        cin.close();
    }
}
