import java.util.Scanner;

public class P1202 {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); )
            System.out.println(f(cin.nextInt()) ? "Lucky Word" : "No Answer");
    }

    private static boolean f(int n) {
        int m = n, tot = 0;
        while (n > 0) {
            tot += n % 10;
            n /= 10;
        }
        return m % tot == 0;
    }
}
