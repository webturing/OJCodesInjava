package nyist.part8graph;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**考点：强连通分量
 * 考查算法：Tarjan算法
 * 解析：
 * 本题需要求给定的有向图中有多少个强连通分量，
 * 然后将强连通分量缩点，
 * 最后求缩点后的有向无环图中，
 * 需要添加多少条边，
 * 可以再次生成一个强连通图
 * 添加的边数为缩点后的有向无环图的出度为0的点的个数与入度为0的点的个数的最大值
 * 即 MAX（zeroOutNumber，zeroInNumber）
 * 当缩点后只有一个点时，需要特判一下，即输出结果就是0，不需要添加边
 */
public class NYIST120强连通分量 {
    static Vector<Integer>[]vectors;
    static int[]dfn,low,vis,components;
    static int num, componentNumber;
    static Stack<Integer>stack;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0){
            int n = scanner.nextInt();
            vectors = new Vector[n+1];
            componentNumber = 0;
            for (int  i = 1; i <= n; i++){
                vectors[i] = new Vector<Integer>();
                int x = scanner.nextInt();
                while (x != 0){
                    vectors[i].add(x);
                    x = scanner.nextInt();
                }
            }
            stack = new Stack<Integer>();
            dfn = new int[n+1];
            low = new int[n+1];
            vis = new int[n+1];
            components = new int[n+1];
            num = 0;
            for (int i = 1; i <= n; i++){
                if (dfn[i]==0){
                    Tarjan(i);
                }
            }
            if (componentNumber == 1){
                System.out.printf("0\n");
                continue;
            }
            int []out = new int[componentNumber+1];
            int []in = new int[componentNumber+1];
            for (int i = 1;  i<= n; i++){
                for (Integer v: vectors[i]){
                    if (components[i] != components[v]){
                        out[components[i]]++;
                        in[components[v]]++;
                    }
                }
            }
            int zeroOutNumber = 0, zeroInNumber = 0;
            for (int  i = 1; i <= componentNumber; i++){
                if (out[i] == 0)
                    zeroOutNumber ++;
                if (out[i] == 0)
                    zeroInNumber ++;
            }
            System.out.print(String.format("%d\n",Math.max(zeroOutNumber, zeroInNumber)));
        }
    }

    private static void Tarjan(int u) {
        dfn[u] = low[u] = ++num;
        stack.add(u);
        vis[u] = 1;
        for (int i = 0; i < vectors[u].size(); i++){
            int v = vectors[u].get(i);
            if (dfn[v] == 0){
                Tarjan(v);
                low[u] = Math.min(low[u],low[v]);
            }
            else if (vis[v] == 1){
                low[u] = Math.min(low[u], dfn[v]);
            }
        }
        if (low[u] == dfn[u]){
            int temp;
            componentNumber++;
            do {
                temp = stack.pop();
                vis[temp] = 0;
                components[temp] = componentNumber;
            }while (temp != u);
        }
    }
}
