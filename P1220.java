import java.util.Scanner;
import java.util.TreeSet;

public class P1220 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int n = cin.nextInt(); n-- > 0; set.add(cin.nextInt())) ;
        for (Integer i : set)
            System.out.println(i);
        cin.close();
    }
}
