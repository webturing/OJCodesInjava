import java.util.Scanner;

public class P1208 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int a = cin.nextInt(); a-- > 0; ) {
            int n = cin.nextInt(), m = cin.nextInt();
            boolean find = false;
            for (int x = 0; x <= n; x++) {
                if (4 * x + 2 * (n - x) == m) {
                    find = true;
                    System.out.println(n - x + " " + x);
                    break;
                }
            }
            if (!find)
                System.out.println("No answer");
        }
        cin.close();
    }
}
