import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1191 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        Vector<Integer> cubes = new Vector<Integer>();
        for (int i = 0; 1L * i * i * i < Integer.MAX_VALUE; i++)
            cubes.add(i * i * i);
        while (cin.hasNext()) {
            int cur = cin.nextInt();
            if (cur < 0) cur = -cur;
            cout.println(Collections.binarySearch(cubes, cur) < 0 ? "NO" : "YES");
        }

        cin.close();
        cout.close();
    }
}
