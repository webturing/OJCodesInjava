package books.ahaAlgorithm.books;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1584Bomber2 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt(), m = cin.nextInt(), x = cin.nextInt(), y = cin.nextInt();
            char[] G[] = new char[n][m];
            for (int i = 0; i < n; i++)
                G[i] = cin.next().toCharArray();
            Queue<Node> Q = new LinkedList<Node>();
            Q.add(new Node(x, y));
            int max = 0;
            while (!Q.isEmpty()) {
                Node a = Q.poll();
                int i = a.x, j = a.y;
                if (i + 1 < n && G[i + 1][j] == '.')//下
                    Q.add(new Node(i + 1, j));
                if (i - 1 >= 0 && G[i - 1][j] == '.')//上
                    Q.add(new Node(i - 1, j));
                if (j + 1 < m && G[i][j + 1] == '.')//右
                    Q.add(new Node(i, j + 1));
                if (j - 1 >= 0 && G[i][j - 1] == '.')//左
                    Q.add(new Node(i, j - 1));
                int c = 0;
                count = 0;
                dfs(G, i, j, n, m, 0);
                c += count;
                count = 0;
                dfs(G, i, j, n, m, 1);
                c += count;
                count = 0;
                dfs(G, i, j, n, m, 2);
                c += count;
                count = 0;
                dfs(G, i, j, n, m, 3);
                c += count;
                if (c > max) max = c;
                G[i][j] = '*';//已经访问，避免重复
            }
            System.out.println(max);
        }
        cin.close();
    }

    private static void dfs(char[][] a, int x, int y, int n, int m, int flag) {
        if (x < 0 || y < 0 || x > n || y > m) return;
        if (a[x][y] == '#') return;
        if (a[x][y] == 'G') count++;
        if (flag == 0) dfs(a, x + 1, y, n, m, flag);
        if (flag == 1) dfs(a, x - 1, y, n, m, flag);
        if (flag == 2) dfs(a, x, y + 1, n, m, flag);
        if (flag == 3) dfs(a, x, y - 1, n, m, flag);
    }

    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}