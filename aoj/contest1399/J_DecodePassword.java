package aoj.contest1399;

import java.util.Scanner;

public class J_DecodePassword {
    private static String abc = "abcdefghijklmnopqrstuvwxyz";
    private static String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String password = in.nextLine();
            StringBuffer p = new StringBuffer(password);

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isLowerCase(ch)) {
                    for (int j = 0; j < map.length; j++) {
                        if (map[j].contains(Character.toString(ch)))
                            p.setCharAt(i, String.valueOf(j).charAt(0));

                    }
                } else if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                    for (int j = 0; j < abc.length(); j++) {
                        if (ch == abc.charAt(j)) {
                            ch = abc.charAt((j + 1) % 26);
                            p.setCharAt(i, ch);
                            break;
                        }
                    }
                    p.setCharAt(i, ch);
                }

            }
            System.out.println(p.toString());
        }
        in.close();
    }
}