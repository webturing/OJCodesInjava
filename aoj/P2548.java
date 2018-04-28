import java.util.Scanner;

public class P2548 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0)
                break;
            if (a < 1000) a = 1000;
            if (b > 9999) b = 9999;
            int tot = 0;
            for (int i = a; i <= b; i++) {
                if (flower(i)) ++tot;
            }
            System.out.println(tot);
        }
        cin.close();
    }

    private static boolean flower(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int m = 0;
        for (char digit : digits) {
            int d = Integer.parseInt(digit+"");
            m += d * d * d * d;
        }
        return n == m;
    }
}