import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1110 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            f(new int[]{cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt()});
        }

        cout.close();
        cin.close();
    }

    private static void f(int[] ints) {
        Arrays.sort(ints);
        int tot = 0;
        for (int a : ints)
            for (int b : ints)
                for (int c : ints)
                    for (int d : ints) {
                        if (a != b && a != c && a != d && b != c && b != d && c != d) {
                            cout.print(String.format("%d%d%d%d", a, b, c, d));
                            if (tot++ % 6 == 5)
                                cout.println();
                            else
                                cout.print(" ");
                        }

                    }
        cout.println();
    }


}
