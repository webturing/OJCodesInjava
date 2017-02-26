import java.util.Scanner;

public class P1024 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long p = 1L, tot = 0;
        for (int i = 1; i <= n; i++) {
            p *= i;
            tot += p;
        }
        System.out.println(tot);
        cin.close();
    }
}
