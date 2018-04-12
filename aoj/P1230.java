package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1230 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int p = cin.nextInt(), q = cin.nextInt();
            if (p == 0 && q == 0) break;
            Matrix a = new Matrix(p, q);
            a.fillData();
            Matrix b = new Matrix(cin.nextInt(), cin.nextInt());
            b.fillData();
            Matrix c = new Matrix(cin.nextInt(), cin.nextInt());
            c.fillData();
            cout.println(Matrix.check(a, b, c) ? "Yes" : "No");
        }

        cout.close();
        cin.close();
    }

    static class Matrix {
        int row;
        int col;
        int a[][];

        Matrix(int row, int col) {
            this.row = row;
            this.col = col;
            a = new int[row][col];
        }

        static boolean check(Matrix a, Matrix b, Matrix c) {
            if (a.col != b.row)
                return false;
            if (a.row != c.row || b.col != c.col)
                return false;
            Matrix d = new Matrix(a.row, b.col);
            for (int i = 0; i < a.row; i++)
                for (int j = 0; j < b.col; j++) {
                    int s = 0;
                    for (int k = 0; k < a.col; k++)
                        s += a.a[i][k] * b.a[k][j];
                    d.a[i][j] = s;
                }
            for (int i = 0; i < d.row; i++)
                for (int j = 0; j < d.col; j++)
                    if (d.a[i][j] != c.a[i][j])
                        return false;
            return true;
        }

        void fillData() {
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++)
                    a[i][j] = cin.nextInt();
        }
    }
}
