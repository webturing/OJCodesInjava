import java.util.Scanner;

public class P1247 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(1L * n * (n + 1) / 2);
        }
        cin.close();
    }
}
