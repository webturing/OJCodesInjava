package nyist.part8graph;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 考点：最短路径
 * 考查算法：Floyd算法
 * 对路径松弛后，看这个点到其本身的距离是否大于1
 * graph[i][j] = Math.max(graph[i][j], graph[i][k] * graph[k][j]);
 * 由于数据量小，点数n不超过30，所以可以使用邻接矩阵来存储图，
 * Created by jal on 2018/5/23 0023.
 */
public class NYIST188最短距离Floyd {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = 0;
        while (cin.hasNext()){
            int n = cin.nextInt();
            if (n == 0)break;
            HashMap<String, Integer>map = new HashMap<String, Integer>();
            for (int i = 1; i <= n; i++){
                map.put(cin.next(), i);
            }
            int m = cin.nextInt();
            double [][]graph = new double[n+1][n+1];
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    if (i == j){
                        graph[i][j] = 1;
                    }
                    else {
                        graph[i][j] = 0;
                    }
                }
            }
            for (int i = 1; i <= m; i++){
                int u = map.get(cin.next());
                double w = cin.nextDouble();
                int v = map.get(cin.next());
                graph[u][v] = w;
            }
            for (int k = 1; k <= n; k++){
                for(int i = 1; i <= n; i++){
                    for(int j = 1; j <= n; j++){
                        graph[i][j] = Math.max(graph[i][j], graph[i][k] * graph[k][j]);
                    }
                }
            }
            boolean flag = false;
            for (int i = 1; i <= n; i++){
                if (Double.compare(graph[i][i], 1d) > 0){
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.print(String.format( "Case %d: Yes\n" ,++t));
            }
            else {

                System.out.print(String.format( "Case %d: No\n" ,++t));
            }
        }
    }
}
