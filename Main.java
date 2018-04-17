import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Main {
    static boolean LOCAL = System.getSecurityManager() == null;
    static boolean TO_FILE = true;
    Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        if (LOCAL) {
            try {
                System.setIn(new FileInputStream("in.txt"));
            } catch (Throwable e) {
                LOCAL = false;
            }
        }
        if (TO_FILE) {
            try {
                System.setOut(new PrintStream("output.txt"));
            } catch (FileNotFoundException e) {
                TO_FILE = false;
            }
        }
        new Main().run();
    }

    void run() {
        int[] arr = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        quickSort(arr);
        debug(arr);
    }

    private void quickSort(int[] ints) {
        quickSort(ints, 0, ints.length - 1);
    }

    private void quickSort(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int p = partition(arr, s, e);
        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    private int partition(int[] arr, int s, int e) {
        int key = arr[s];
        int i = s;
        for (int j = i + 1; j <= e; j++) {
            if (arr[j] < key) {
                swap(arr, i + 1, j);
                i++;
            }
        }
        swap(arr, i, s);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }
}