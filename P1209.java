import java.util.Scanner;

public class P1209 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double U = cin.nextDouble();
        double D = cin.nextDouble();
        double H = cin.nextDouble();
        double L = Math.hypot((D - U) / 2, H);
        double area = (U + D) * H / 2;
        double perimeter = 2 * L + U + D;
        System.out.println(String.format("%.2f\n%.2f", area, perimeter));

        cin.close();
    }
}
