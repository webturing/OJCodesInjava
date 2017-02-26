import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class P1221 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        String words[] = cin.nextLine().trim().split("\\W+");
        TreeMap<String, Integer> mp = new TreeMap<String, Integer>();
        for (String word : words) {
            if (mp.containsKey(word)) {
                mp.put(word, mp.get(word) + 1);
            } else {
                mp.put(word, 1);
            }
        }
        cout.println(words.length);
        for (String word : mp.keySet())
            cout.println(word + ":" + mp.get(word));
        cout.close();
        cin.close();
    }
}
