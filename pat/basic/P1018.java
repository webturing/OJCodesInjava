package pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1018 {


    public static void main(String[] args) throws IOException {
        String S = "CJB";
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int T = (int) in.nval;
        int[] A = new int[3];
        int[] a = new int[3];
        int[] b = new int[3];
        while (T-- > 0 && in.nextToken() != StreamTokenizer.TT_EOF) {
            int ia = S.indexOf(in.sval);
            in.nextToken();
            int ib = S.indexOf(in.sval);
            if (ia == ib) {
                A[1]++;
            } else if ((ia + 1) % 3 == ib) {
                A[0]++;
                ++a[ia];
            } else {
                A[2]++;
                ++b[ib];
            }

        }
        System.out.println(String.format("%d %d %d", A[0], A[1], A[2]));
        System.out.println(String.format("%d %d %d", A[2], A[1], A[0]));
        int ma = 2;
        if (a[0] > a[ma]) ma = 0;
        if (a[1] > a[ma]) ma = 1;
        int mb = 2;
        if (b[0] > b[mb]) mb = 0;
        if (b[1] > b[mb]) mb = 1;
        System.out.println(S.charAt(ma) + " " + S.charAt(mb));
    }
}
