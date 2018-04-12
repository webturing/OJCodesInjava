package aoj;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class P1204 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; )
            cout.println(check(cin.next().toCharArray()) ? "Yes" : "No");

        cout.close();
        cin.close();
    }

    private static boolean check(char[] chars) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : chars) {
            if (c == '(' || c == '[')
                stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(')
                    return false;
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[')
                    return false;
                stack.pop();
            }

        }
        return stack.isEmpty();
    }


}
