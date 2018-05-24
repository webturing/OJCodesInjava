package nyist.part8graph;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 考查算法：最短路，01背包
 * 由于每个武将到达一个城池后，如果拿下宝藏，就得留下来镇守，即不能离开，
 * 所以可以使用Dijkstra算法求得从0（源点）到达每一城池的最短路径，即为最小费用dis[i]，
 * 而每个城池的宝藏数量则为价值w[i]。
 * 题目已知总费用为输入的s，求最大花费不超过s的情况下，能取得的最大价值为多少dp[s]。
 * 那么本题将转化成一个01背包问题。
 * 状态转移方程为dp[v] = max(dp[v], dp[v-dis[i]]+w[i])
 * Created by jal on 2018/5/24 0024.
 */
public class NYIST203最短路径01背包 {
    private static int n,m;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-->0){
            int s = cin.nextInt();
            n = cin.nextInt();
            m = cin.nextInt();
            int [][]a = new int[n+2][n+2];
            for (int i = 0; i <= n; i++){
                for (int j  = 0; j <= n; j++){
                    if (i == j){
                        a[i][j] = 0;
                    }else {
                        a[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
            for (int i = 1; i <= m; i++){
                int u = cin.nextInt();
                int v = cin.nextInt();
                int w = cin.nextInt();
                w = Math.min(a[u][v], w); //此处很关键，一定要写，因为两点之间会有多条边，邻接矩阵记录最小边
                a[u][v] = w;
                a[v][u] = w;
            }
            int []w = new int[n+1];
            for (int i = 1; i<=n; i++){
                w[i] = cin.nextInt();
            }
            Dijkstra(a, 0);
            int []dp = new int[s+1];
            for(int i = 1; i <= n; i++){
                for(int v = s; v >= dis[i]; v--){
                    dp[v] = Math.max(dp[v], dp[v-dis[i]]+w[i]);
                }
            }
            System.out.print(String.format("%d\n",dp[s]));
        }
    }
    static int []dis;
    private static void Dijkstra(int [][]a, int start) {
        boolean []book = new boolean[n+1];
        dis = new int[n+1];
        Arrays.fill(book,false);
        for (int i = 0; i <= n; i++){
            dis[i] = a[start][i];
        }
        book[start] = true;
        dis[start] = 0;
        for (int i = 1; i <= n; i++){
            int min = Integer.MAX_VALUE;
            int k = 0;
            for (int j = 0; j <= n; j++){
                if (book[j] == false && dis[j] < min){
                    min = dis[j];
                    k = j;
                }
            }
            book[k] = true;
            for (int j = 0; j <= n; j++){
                if (book[j] == false && a[k][j] < Integer.MAX_VALUE){
                    dis[j] = Math.min(dis[j], dis[k] + a[k][j]);
                }
            }
        }
    }
}
/*
2
10 1 1
0 1 3
2
5 2 3
0 1 2
0 2 4
1 2 1
2 3
* */