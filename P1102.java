import java.util.Scanner;

public class P1102 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int square = 0, cube = 0;
            for (int i = a; i <= b; i++)
                if (i % 2 == 0)
                    square += i * i;
                else
                    cube += i * i * i;
            System.out.println(square + " " + cube);
        }
        cin.close();
    }
}
