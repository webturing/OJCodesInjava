package nyist.part8graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 考点：二分图的最小覆盖 == 最大匹配
 * 算法：匈牙利算法
 * 题目分析：如果图上的第i行的第j列有敌人，则表示i与j有相连。
 * 求最少放多少个炸弹可以炸掉所有敌人，每个炸弹可以炸掉所在行或列的所有敌人，
 * 行和列可以看成二分图的左部和右部。
 * 即求选最少的点，其发出的边可以覆盖整个图，
 * 也就是求二分图的最小覆盖，最小覆盖在数值上等于最大匹配，所以可以用匈牙利算法求最大匹配。
 * Created by jal on 2018/5/28 0028.
 */
public class NYIST237二分图最小覆盖 {
    static class Edge{
        int to, next;

        @Override
        public String toString() {
            return "Edge{" +
                    "to=" + to +
                    ", next=" + next +
                    '}';
        }
    }
    private static int[] head;
    private static Edge[] edges;
    private static int edgeNum, n, k;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-->0){
            n = cin.nextInt();
            k = cin.nextInt();
            head = new int[n+1];
            Arrays.fill(head, -1);
            edges = new Edge[k+1];
            link = new int[n+1];
            visit = new boolean[n+1];
            edgeNum = 1;
            for(int i = 1; i <= k; i++){
                int u = cin.nextInt();
                int v = cin.nextInt();
                addEdge(u,v);
                //addEdge(v,u);
            }

            cnt = 0;
            Hungary();
            System.out.print(String.format("%d\n",cnt));
        }
    }
    private static boolean []visit;
    private static int cnt;
    private static void Hungary() {
        for(int i = 1; i <= n; i++){
            Arrays.fill(visit, false);
            if (dfs(i)){
                cnt++;
            }
        }
    }
    private static int []link;
    private static boolean dfs(int x) {
        for(int i = head[x]; i != -1; i = edges[i].next){
            int v = edges[i].to;
            if (!visit[v]){
                visit[v] = true;
                if (link[v] == 0 || dfs(link[v])){
                    link[v] = x;
                    return true;
                }
            }
        }
        return false;
    }
    private static void addEdge(int u, int v) {
        edges[edgeNum] = new Edge();
        edges[edgeNum].to = v;
        edges[edgeNum].next = head[u];
        head[u] = edgeNum++;
    }
}
