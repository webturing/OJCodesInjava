package books.ahaAlgorithm.books.excise;

import java.util.Scanner;

public class P1584Bomber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt(), m = cin.nextInt();
            char[][] G = new char[n][m];
            for (int i = 0; i < n; i++)
                G[i] = cin.next().toCharArray();
            int px = -1, py = -1, max = 0;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    if (G[i][j] == '.') {
                        int cur = dfs(i, j, G);
                        if (cur > max) {
                            px = i;
                            py = j;
                            max = cur;
                        }
                    }
                }
            System.out.println(max);
        }
        cin.close();
    }

    private static int dfs(int x0, int y0, char[][] g) {
        int cnt = 0;
        for (int y = y0 - 1; y >= 0; y--) {
            if (g[x0][y] == 'G') ++cnt;
            if (g[x0][y] == '#')
                break;
        }
        for (int y = y0 + 1; y < g[x0].length; y++) {
            if (g[x0][y] == 'G') ++cnt;
            if (g[x0][y] == '#')
                break;
        }
        for (int x = x0 - 1; x >= 0; x--) {
            if (g[x][y0] == 'G') ++cnt;
            if (g[x][y0] == '#')
                break;
        }
        for (int x = x0 + 1; x < g.length; x++) {
            if (g[x][y0] == 'G') ++cnt;
            if (g[x][y0] == '#')
                break;
        }
        return cnt;
    }

    private static void disp2(char[][] g) {
        for (int i = 0; i < g.length; i++)
            System.out.println(new String(g[i]));
    }

}
