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
                    return new BigInteger(s2).compareTo(new BigInteger(s1));
                }
            });
            String max = "";
            for (String number : numbers)
                max += number;
            Arrays.sort(numbers, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String s1 = o1 + o2;
                    String s2 = o2 + o1;
                    return new BigInteger(s1).compareTo(new BigInteger(s2));
                }
            });
            String min = "";
            for (String number : numbers)
                min += number;
            System.out.println(new BigInteger(max).subtract(new BigInteger(min)));
        }
        in.close();
    }
}
