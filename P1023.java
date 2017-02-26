import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1023 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        while (cin.hasNext()) v.add(cin.nextInt());
        System.out.println(Collections.max(v));
        cin.close();
    }
}
