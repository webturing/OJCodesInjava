import java.util.Scanner;

public class P2547 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0) break;
            int c = (a + b) % 7;
            if (c == 0) c = 7;
            System.out.println(c);
        }
        cin.close();
    }
}