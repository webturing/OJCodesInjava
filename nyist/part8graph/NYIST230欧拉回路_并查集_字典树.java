package nyist.part8graph;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 考点 算法 数据结构：欧拉回路、并查集、字典树
 * 这道题是一个很好的图论综合题，求给出的棒子是否能够拼接成一个棒子，只有两个棒子的某一端颜色相同才能拼接。
 * 首先，我们要将输入的字符串转化为整型的数字，作为无向图的点，由于数据太大，所以不能用map，要用字典树来存储
 * 然后判断这个无向图是否连通，如果不连通，直接输出Impossible。判断无向图是否连通直接并查集就好
 * 如果无向图是连通的，再判断这个图是不是有欧拉通路，即同一笔画问题。
 * 判断是不是有欧拉通路，就是记录每个点的度数，然后统计度数为奇数的点的个数oddDegree，
 * 如果oddDegree为0，则是欧拉回路，肯定满足要求，如果oddDegree是2，则是欧拉通路，也满足要求。
 * 只有oddDegree是0和2这两种情况输出Possible，其余情况都输出Impossible。
 * Created by jal on 2018/5/27 0027.
 */
public class NYIST230欧拉回路_并查集_字典树 {
    static class Trie{
        int num;
        Trie[] tries = new Trie[N];
    }
    static Trie root;
    static final int N = 26;
    static int n;
    private static int[] F, degree;
    static Scanner cin;
    public static void main(String[] args) {
        cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-->0){
            int m = cin.nextInt();
            F = new int[m*2+1];
            degree = new int[m*2+1];
            Arrays.fill(degree, 0);
            for (int  i = 1; i <= m*2; i++)F[i] = i; // 初始化并查集数组
            n = 0;
            root = new Trie();
            init(m);// 初始化
            int group = 0;
            for(int i = 1; i <= n; i++){
                if (F[i] == i){
                    group ++;
                }
            }
            if (group > 1){
                System.out.print(String.format("Impossible\n"));
                continue;
            }
            int oddDegree = 0;
            for (int i = 1; i <= n; i++){
                if (degree[i] % 2 == 1){
                    oddDegree ++;
                }
            }
            if (oddDegree == 0 || oddDegree == 2){
                System.out.print(String.format("Possible\n"));
            }
            else {
                System.out.print(String.format("Impossible\n"));
            }
        }
    }
    private static void init(int m) {
        for(int i = 1; i <= m; i++){
//            边建立字典树，边统计点的个数。在建树的过程中完成点对的合并，查看是否为连通图
            int x = buildTrie(cin.next());//获取字符串对应的数字值
            int y = buildTrie(cin.next());//获取字符串对应的数字值
            int xRoot = find(x);
            int yRoot = find(y);
            if (xRoot != yRoot){
                F[xRoot] = yRoot;
            }
        }
    }

    private static int buildTrie(String word) {
        char[]chars = word.toCharArray();
        Trie p = root;
        boolean flag = false;
        for (int i = 0; i < chars.length; i++){
            if (p.tries[chars[i] - 'a'] == null){
                flag = true;
                p.tries[chars[i] - 'a'] = new Trie();
                p.num = 0;
            }
            p = p.tries[chars[i] - 'a'];
        }
        if (flag){//产生新的树枝
            p.num = ++n;//记录该字符串对应的整数序号
            degree[n]++;//度数自加    下同
            return p.num;
        } //下面的情况表示flag == false
        if (p.num == 0){//新加入的字符串是已存在的字符串的前缀，例如字典树中已有abcdf，新加入的字符串为abc
            p.num = ++n;
            degree[n]++;
            return p.num;
        }
        else{ // p.num != 0 , 新加入的字符串早已存在
            degree[p.num]++;
            return p.num;
        }
    }

    private static int find(int x) {
        return x == F[x] ? x :(F[x] = find(F[x]));
    }
}
