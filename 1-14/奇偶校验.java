package 每日一题.day30;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-14 19:05
 * @description
 */
public class 奇偶校验 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            jiCheck(str.toCharArray());
        }
    }

    public static void jiCheck(char[] s) {
        int[] result = new int[8];
        for (int i = 0; i < s.length; i++) {
            int oneNum = 0;
            int one = 0x01;
            int index = 7;
            while (index > 0) {
                result[index] = ((s[i] & one) == 0) ? 0 : 1;
                if (result[index] == 1) oneNum++;
                one <<= 1;
                index--;
            }
            if (oneNum % 2 == 0) result[0] = 1;
            for (int k = 0; k < 8; k++) {
                System.out.print(result[k]);
            }
            System.out.println();
            result[0] = 0;//update
        }
    }
}
