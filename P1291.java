import java.util.Scanner;

public class P1291 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        if (a < 100) a = 100;
        if (b > 999) b = 999;
        for (int i = a; i <= b; i++) {
            int j = i, t = 0;
            while (j > 0) {
                int k = j % 10;
                t += k * k * k;
                j /= 10;
            }
            if (t == i)
                System.out.println(i);
        }
        cin.close();
    }
}
