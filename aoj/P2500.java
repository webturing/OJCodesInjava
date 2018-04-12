package aoj;

import java.util.Scanner;

public class P2500 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-- > 0) {
            int[] schoolTime = new int[7];
            int[] mumTime = new int[7];
            int[] week = new int[7];
            for (int i = 0; i < 7; i++) {
                schoolTime[i] = cin.nextInt();
                mumTime[i] = cin.nextInt();
            }
            int k = 0;
            for (int i = 0; i < 7; i++) {
                week[i] = schoolTime[i] + mumTime[i];
                if (k <= week[i])
                    k = week[i];
            }
            if (k <= 8)
                System.out.println(0);
            else {
                for (int i = 0; i < 7; i++) {
                    if (k == week[i]) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
        cin.close();
    }
}