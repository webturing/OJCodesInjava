package nyist.part8graph;
import java.util.Scanner;

/**
 * 考点：传递闭包
 * 考查算法：Floyd算法
 * 题目大意：有n头牛，有m条关系，每条关系指出了第一头牛能战胜第二头牛，这种战胜关系具有传递性。比如说A战胜B，B战胜C，则A战胜C
 * 求有多少头牛的成绩能被确定。
 * 解题关键：如果某头牛能战胜的数目与能战胜它的数目相加之和等于n-1，则说明该头牛的成绩能被确定。
 * Created by jal on 2018/5/25 0025.
 */
public class NYIST211传递闭包Floyd {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int n = cin.nextInt();
            int m = cin.nextInt();
            if (n == 0 && m == 0){
                break;
            }
            boolean [][]a = new boolean[n+1][n+1];
            for (int i = 1; i <= m; i++){
                int x = cin.nextInt();
                int y = cin.nextInt();
                a[x][y] = true;
            }
            Floyd(a, n);
            int sum = 0;
            for (int i = 1; i <= n; i++){
                int ret = 0;
                for(int j = 1; j <= n; j++){
                    if (a[i][j] || a[j][i]) ret++;
                }
                if (ret == n-1){
                    sum++;
                }
            }
            System.out.print(String.format("%d\n",sum));
        }
    }

    private static void Floyd(boolean[][] a, int n) {
        for (int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    a[i][j] = a[i][j] || (a[i][k] && a[k][j]);
                }
            }
        }
    }
}
