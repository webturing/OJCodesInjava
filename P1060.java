import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1060 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int size = cin.nextInt();
            if (size == 0)
                break;
            Integer[] ints = new Integer[size];
            for (int i = 0; i < ints.length; i++)
                ints[i] = cin.nextInt();
            Arrays.sort(ints, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Math.abs(o2) - Math.abs(o1);
                }
            });
            cout.print(ints[0]);
            for (int i = 1; i < size; i++)
                cout.print(" " + ints[i]);
            cout.println();
        }
        cout.close();
        cin.close();
    }


}
