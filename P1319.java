import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class P1319 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            if (foo(cin.next()).equals(foo(cin.next())))
                cout.println("Yes");
            else
                cout.println("No");
        }
        cout.close();
        cin.close();
    }

    private static TreeSet<Character> foo(String s) {
        TreeSet<Character> set = new TreeSet<Character>();
        for (char c : s.toCharArray())
            set.add(c);
        return set;
    }


}
