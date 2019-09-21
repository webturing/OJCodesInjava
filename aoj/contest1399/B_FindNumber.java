package aoj.contest1399;

public class B_FindNumber {
    public static void main(String[] args) {
        for (int n = 1; ; n++) {
            if (n % 8 != 1) continue;
            if (n / 8 % 8 != 1) continue;
            if (n / 64 % 8 != 7) continue;
            int a = n / 64 / 8;
            if (n % 17 != 4) continue;
            if (n / 17 % 17 != 15) continue;
            int b = n / 17 / 17;
            if (b != 2 * a) continue;
            System.out.println(n);
            break;
        }
    }
}