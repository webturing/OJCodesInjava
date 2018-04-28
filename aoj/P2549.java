import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P2549 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-- > 0) {
            Set<Character> set = new HashSet<Character>();
            for (char c : cin.next().toCharArray())
                set.add(c);
            System.out.println(set.size() == 1 ? "Y" : "N");
        }
        cin.close();
    }
}