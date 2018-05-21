package nyist.part8graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Vector;

/**
 * 这是一道非常简单的次小生成树的模板题，但由于不够细心，将i==vector.get(k)写成了i==k, 导致wa了两次，长记性了
 * Created by jal on 2018/5/21 0021.
 */
public class NYIST118次小生成树 {
    static int[]F;
    static class  Edge implements Comparable<Edge>{
        int u,v,w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws IOException{
        StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        cin.nextToken();
        int T = (int) cin.nval;
        while (T-->0){
            cin.nextToken();
            int V = (int) cin.nval;
            cin.nextToken();
            int E = (int) cin.nval;
            Edge []edges = new Edge[E];
            for (int i = 0; i < E; i++){
                cin.nextToken();
                int u = (int) cin.nval;
                cin.nextToken();
                int v = (int) cin.nval;
                cin.nextToken();
                int w = (int) cin.nval;
                edges[i] = new Edge(u,v,w);
            }
            Arrays.sort(edges);
            F = new int[V+1];
            for (int i = 1; i <= V; i++){
                F[i] = i;
            }
            int countEdge = 0;
            int sum = 0;
            Vector<Integer>vector = new Vector<Integer>();
            for(int i = 0; i < edges.length; i++){
                int u = edges[i].u;
                int v = edges[i].v;
                int w = edges[i].w;
                if (merge(u, v)){
                    countEdge++;
                    sum+=w;
                    vector.add(i);
                }
                if (countEdge >= V-1){
                    break;
                }
            }
            boolean flag = false;
            for (int k = 0; k < vector.size(); k++){
                for (int i = 1; i <= V; i++)F[i] = i;
                int num = 0;
                int sum2 = 0;
                for (int i = 0; i < edges.length; i++){
                    if (i == vector.get(k) )continue;
                    int u = edges[i].u;
                    int v = edges[i].v;
                    int w = edges[i].w;
                    if (merge(u, v)){
                        num++;
                        sum2+= w;
                    }
                    if (num == V-1){
                        break;
                    }
                }
                if (num == V-1 && sum2 == sum){
                    flag = true;
                    System.out.printf("Yes\n");
                    break;
                }
            }
            if (!flag){
                System.out.printf("No\n");
            }
        }
    }

    private static boolean merge(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        if (rootU == rootV)return false;
        F[rootU] = rootV;
        return true;
    }

    private static int find(int u) {
        if (F[u] == u)return u;
        return F[u] = find(F[u]);
    }
}
