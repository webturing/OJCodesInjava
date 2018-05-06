package nyist.part7highPrecision;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 先按照可凑的最大值排序
 * 然后利用BigInteger构造max min
 * 计算大数max-min
 */
public class NYIST1233BigIntegerSubStract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            String[] numbers = new String[in.nextInt()];
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = in.next();
            Arrays.sort(numbers, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String s1 = o1 + o2;
                    String s2 = o2 + o1;
                    return s2.compareTo(s1);
                }
            });
            StringBuffer max = new StringBuffer();
            StringBuffer min = new StringBuffer();
            for (int i = 0; i < numbers.length; i++) {
                max.append(numbers[i]);
                min.append(numbers[numbers.length - 1 - i]);
            }
            System.out.print(new BigInteger(max.toString()).subtract(new BigInteger(min.toString())) + "\n");
        }
        in.close();
    }
}
