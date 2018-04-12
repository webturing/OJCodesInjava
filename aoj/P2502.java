package aoj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Main {
    static boolean LOCAL = System.getSecurityManager() == null;
    static boolean TO_FILE = true;
    Scanner cin = new Scanner(System.in);

    void run() {
        int T = Integer.parseInt(cin.nextLine());
        while (T-- > 0) {
            String[] words = cin.nextLine().toUpperCase().split("\\s+");
            StringBuilder builder = new StringBuilder();
            for (String word : words)
                builder.append(word.charAt(0));
            System.out.println(builder);

        }
    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }

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
}