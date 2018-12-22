package books.ahaAlgorithm.books.excise;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class P1583BraceMatchChecker {
    static HashMap<Character, Character> pair = new HashMap<Character, Character>();

    static {
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            char[] cs = cin.nextLine().toCharArray();
            System.out.println(check(cs) ? "YES" : "NO");
        }
        cin.close();
    }

    private static boolean check(char[] cs) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : cs) {
            if ("([{".indexOf(c) >= 0)
                stack.push(c);
            else if (")]}".indexOf(c) >= 0) {
                if (stack.isEmpty() || !pair.get(stack.peek()).equals(c))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
