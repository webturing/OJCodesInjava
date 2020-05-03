package pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        int B = Integer.parseInt(input[1]);
        int k = 0;
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            k = k * 10 + A.charAt(i) - '0';
            stringBuffer.append((char) (k / B + '0'));
            k = k % B;
        }
        String result = stringBuffer.toString();
        if (result.charAt(0) == '0' && result.length() != 1) {
            System.out.print(result.substring(1) + " " + k);
        } else {
            System.out.print(result + " " + k);
        }

    }

}
